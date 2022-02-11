package com.uyou.core;

import com.uyou.core.entity.UserSecurity;
import com.uyou.service.UserService;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/**
 * @author zxwang
 * @createdAt 2022/1/18 19:26
 * @description
 */
@Component
public class LoginValidateAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private UserService userService;
    @Autowired
    private StringEncryptor stringEncryptor;

    @Override
    public Authentication authenticate(Authentication authentication){
        //获取输入的用户名
        String username = authentication.getName();
        //获取输入的明文
        String rawPassword = (String) authentication.getCredentials();

        //查询用户是否存在
        UserSecurity user = (UserSecurity) userService.loadUserByUsername(username);

        if (!user.isEnabled()) {
            throw new DisabledException("该账户已被禁用，请联系管理员");

        } else if (!user.isAccountNonLocked()) {
            throw new LockedException("该账号已被锁定");

        } else if (!user.isAccountNonExpired()) {
            throw new AccountExpiredException("该账号已过期，请联系管理员");

        } else if (!user.isCredentialsNonExpired()) {
            throw new CredentialsExpiredException("该账户的登录凭证已过期，请重新登录");
        }

        //验证密码
        if (!stringEncryptor.decrypt(user.getPassword()).equals(rawPassword)) {
            throw new BadCredentialsException("输入密码错误!");
        }

        return new UsernamePasswordAuthenticationToken(user, rawPassword, user.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        //确保authentication能转成该类
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}

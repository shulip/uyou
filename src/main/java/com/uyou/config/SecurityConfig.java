package com.uyou.config;

import com.uyou.core.LoginValidateAuthenticationProvider;
import com.uyou.core.handler.LoginFailureHandler;
import com.uyou.core.handler.LoginSuccessHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.Resource;

/**
 * @author zxwang
 * @createdAt 2022/1/18 19:24
 * @description
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //自定义认证
    @Resource
    private LoginValidateAuthenticationProvider loginValidateAuthenticationProvider;

    //登录成功handler
    @Resource
    private LoginSuccessHandler loginSuccessHandler;

    //登录失败handler
    @Resource
    private LoginFailureHandler loginFailureHandler;

    /**
     * 权限核心配置
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //基础设置
        http.httpBasic()//配置HTTP基本身份验证
                .and()
                .authorizeRequests()
//                .anyRequest().authenticated()//所有请求都需要认证
                .antMatchers("/user/register").permitAll()
                .antMatchers("/**").authenticated()
                .and()
                .formLogin() //登录表单
                .loginProcessingUrl("/user/login")//登录验证url
                .successHandler(loginSuccessHandler)//成功登录处理器
                .failureHandler(loginFailureHandler)//失败登录处理器
                .permitAll();//登录成功后有权限访问所有页面

        //关闭csrf跨域攻击防御,没有默认登录页
        http.csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //这里要设置自定义认证
        auth.authenticationProvider(loginValidateAuthenticationProvider);
    }
}

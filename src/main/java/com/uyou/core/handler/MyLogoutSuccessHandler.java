package com.uyou.core.handler;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.uyou.utils.ResultWrapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zxwang
 * @createdAt 2022/1/20 13:25
 * @description
 */
@Component
public class MyLogoutSuccessHandler implements LogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        //登出成功返回
        //设置返回请求头
        response.setContentType("application/json;charset=utf-8");
        //写出流
        PrintWriter out = response.getWriter();
        out.write(JSONObject.toJSONString(new ResultWrapper(), SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty));
        out.flush();
        out.close();
    }
}

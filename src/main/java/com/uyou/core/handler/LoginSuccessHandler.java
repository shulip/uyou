package com.uyou.core.handler;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.uyou.utils.ResultWrapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zxwang
 * @createdAt 2022/1/18 19:26
 * @description
 */
@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        //登录成功返回
        //设置返回请求头
        response.setContentType("application/json;charset=utf-8");
        response.setHeader("Access-Control-Allow-Origin",request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials","true");
        //写出流
        PrintWriter out = response.getWriter();
        out.write(JSONObject.toJSONString(new ResultWrapper(), SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty));
        out.flush();
        out.close();
    }
}

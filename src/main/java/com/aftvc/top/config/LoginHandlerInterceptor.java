package com.aftvc.top.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ Author     ：Yan
 * @ Date       ：Created in 17:48 2020/4/14
 * @ Description：LoginHandlerInterceptor
 * @ Modified By：
 * @Version: $
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object username = request.getSession().getAttribute("username");
        if(username==null){
            request.setAttribute("msg","Pleace login!");
            request.getRequestDispatcher("login").forward(request,response);
            return false;
        }else{
            return true;
        }
    }
}

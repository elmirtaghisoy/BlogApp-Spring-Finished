package com.example.sweater.util;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectInter extends HandlerInterceptorAdapter {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        String args = request.getQueryString() !=null?request.getQueryString():""; //URLdeki arqumentleri goturur
        String url = request.getRequestURI().toString() + "?"+args;
        if (modelAndView !=null){
           response.setHeader("Turbolinks-Location",url);
       }
    }
}

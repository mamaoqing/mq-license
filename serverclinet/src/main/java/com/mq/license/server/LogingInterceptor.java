package com.mq.license.server;

import com.mq.license.comon.util.LicenseVerify;
import javafx.geometry.VPos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mq
 * @description: TODO
 * @title: LogingInterceptor
 * @projectName license-mq
 * @date 2020/12/249:47
 */
@Slf4j
@Component
public class LogingInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LicenseVerify licenseVerify = new LicenseVerify();
        boolean verify = licenseVerify.verify();
        log.info("开始执行拦截验证：<{}>",verify);
        if(!verify){
            //do something
            log.error("license is out of date......");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

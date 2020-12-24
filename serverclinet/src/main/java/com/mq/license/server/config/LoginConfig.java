package com.mq.license.server.config;

import com.mq.license.server.LogingInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author mq
 * @description: TODO
 * @title: LoginConfig
 * @projectName license-mq
 * @date 2020/12/249:51
 */
@Configuration
@Slf4j
public class LoginConfig implements WebMvcConfigurer {
    static {
        log.info("LoginConfig is start......");
    }

    public LogingInterceptor logingInterceptor(){
        return new LogingInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(logingInterceptor());
        registration.addPathPatterns("/**");
    }
}

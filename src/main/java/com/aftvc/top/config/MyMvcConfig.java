package com.aftvc.top.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ Author     ：Yan
 * @ Date       ：Created in 19:25 2020/4/14
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/registerUser").setViewName("register");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("index");
   }
    //返回自定义的国际化
/*
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
*/

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/ajax/**","/userRegister",",/","/login","/tologin","/css/**","/images/**","/js/**","/docs/**","/fonts/Roboto/**","/scss/**","/vendors/**","/registerUser");
    }
}

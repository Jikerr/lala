package com.lala.common.config;

import com.lala.common.Interceptors.AuthInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 16:30 2018/1/29
 * @Modified By :
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

    /**
     * 配置拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);

    }

    /**
     * 添加自定义的静态资源映射
     这里使用代码的方式自定义目录映射，并不影响Spring Boot的默认映射，可以同时使用。
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //资源处理 相当于spring mvc 的资源映射
        //      registry.addResourceHandler("/new/**").addResourceLocations("classpath:/new/");
        //      registry.addResourceHandler("/**").addResourceLocations("/");

        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/");

        //super.addResourceHandlers(registry);
    }

   /* @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        super.configurePathMatch(configurer);
        configurer.setUseSuffixPatternMatch(false);
    }*/

}
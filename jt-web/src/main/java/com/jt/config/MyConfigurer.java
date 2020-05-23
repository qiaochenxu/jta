package com.jt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @BelongsProject: jta
 * @BelongsPackage: com.jt.config
 * @CreateTime: 2020-04-16 18:21
 * @Description:
 */
@Configuration //表示配置类
public class MyConfigurer implements WebMvcConfigurer {
    //开启匹配后缀型匹配
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(true);
    }
}

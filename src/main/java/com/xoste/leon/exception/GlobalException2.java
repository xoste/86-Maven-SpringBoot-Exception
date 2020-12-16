package com.xoste.leon.exception;

/**
 * 通过SimpleMappingExceptionResolver实现全局异常处理的方式 2
 * @author Leon
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

//@Configuration
public class GlobalException2 {
    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties mapping = new Properties();
        // 参数一：异常的类型，注意必须是异常类型的全名
        // 参数二：视图名称
        mapping.put("java.lang.NullPointException", "error3");
        mapping.put("java.lang.ArithmeticException", "error2");
        // 设置异常与视图映射信息
        resolver.setExceptionMappings(mapping);
        return resolver;
    }
}

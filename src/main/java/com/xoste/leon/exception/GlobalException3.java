package com.xoste.leon.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Leon
 */
@Configuration
public class GlobalException3 implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        // 判断异常类型，做不同的视图跳转
        if (e instanceof ArithmeticException) {
            modelAndView.setViewName("error2");
        }
        if (e instanceof NullPointerException) {
            modelAndView.setViewName("error3");
        }
        return modelAndView;
    }
}

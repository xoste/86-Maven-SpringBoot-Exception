package com.xoste.leon.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局处理异常的方式1
 * @author Leon
 */
//@ControllerAdvice
public class GlobalException1 {
    /**
     * java.lang.ArithmeticException:
     * 该方法需要返回一个ModelView：目的是可以封装异常信息和指定的视图
     * 参数Exception e:会将产生的异常对象注入到方法中
     * */
    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticExceptionHandler(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error", e.toString());
        modelAndView.setViewName("error2");
        return modelAndView;
    }
    /**
     * java.lang.NullPointerException:
     * 该方法需要返回一个ModelView：目的是可以封装异常信息和指定的视图
     * 参数Exception e:会将产生的异常对象注入到方法中
     * */
    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView nullPointerExceptionHandler(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error", e.toString());
        modelAndView.setViewName("error3");
        return modelAndView;
    }
}

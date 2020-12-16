package com.xoste.leon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * springboot处理异常方式1，自定义错误页面(异常全部跳转到同一页面，页面名称必须叫error)
 * @author Leon
 */
@Controller
public class DemoController {
    @RequestMapping("/show")
    public String showPage() {
        int x = 5 / 0;
        return "/index";
    }
    @RequestMapping("/show2")
    public String showPage2(String s) {
        s.toString();
        return "/index";
    }
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

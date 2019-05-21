package com.crk.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author: 程荣凯
 * @Date: 2018/6/19 22:01
 */
@Aspect
public class AspectConfig {
    @Pointcut("execution(* *.doTask(..))")
    public void getPoint(){
    }
    @Before("getPoint()")
    public void doBefore(){
        System.out.println("before:");
    }
    @After("getPoint()")
    public void doAfter(){
        System.out.println("after:");
    }
}

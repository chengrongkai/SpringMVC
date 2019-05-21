package com.crk.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 程荣凯 on 2018/4/8.
 */
public class test {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        knight knight1 = app.getBean(knight.class);
//        knight1.doTask();
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(com.crk.pojo.CDPlayerConfig.class);
//        knight knight1 = configApplicationContext.getBean(knight.class);
//        knight1.doTask();
        CompactDisc compactDisc = configApplicationContext.getBean(SgtPeppers.class);
        compactDisc.play();
    }
}

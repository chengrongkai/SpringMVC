package com.crk.config;

import com.crk.pojo.Quest;
import com.crk.pojo.SlayDragonQuest;
import com.crk.pojo.knight;
import com.crk.pojo.minstrel;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.beans.Expression;

/**
 * @Author: 程荣凯
 * @Date: 2018/6/19 21:11
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class knightConfiger {
    @Bean(name = "knight")
    public knight getKnight(){
        return new knight(getQuest());
    }
    @Bean(name = "Quest")
    public Quest getQuest(){
        return new SlayDragonQuest(System.out);
    }
    @Bean(name = "minstrel")
    public minstrel minstrel(){
        return new minstrel(System.out);
    }
    @Bean()
    public AspectConfig aspectConfig(){
        return new AspectConfig();
    }

}

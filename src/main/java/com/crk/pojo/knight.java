package com.crk.pojo;

/**
 * @Author: 程荣凯
 * @Date: 2018/6/19 20:57
 */
public class knight {
    Quest currentQuest;
    public knight(Quest quest){
        currentQuest = quest;
    }
    public void doTask(){
        currentQuest.doTask1();
    }
}

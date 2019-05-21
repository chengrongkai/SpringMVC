package com.crk.pojo;

import java.io.PrintStream;

/**
 * @Author: 程荣凯
 * @Date: 2018/6/19 20:59
 */
public class SlayDragonQuest implements Quest{
    PrintStream stream;
    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }
    public void doTask1() {
        stream.println("SlayDragonQuest");
    }
}

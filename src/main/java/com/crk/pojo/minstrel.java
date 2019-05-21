package com.crk.pojo;

import java.io.PrintStream;

/**
 * @Author: 程荣凯
 * @Date: 2018/6/19 21:23
 */
public class minstrel {
    private PrintStream printStream;
    public minstrel(PrintStream printStream){
        this.printStream = printStream;
    }
    public void  singleBefore(){
        printStream.println("before:");
    }
    public void  singleAfter(){
        printStream.println("after:");
    }
}

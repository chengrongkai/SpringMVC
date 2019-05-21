package com.crk.pojo;

import org.springframework.stereotype.Component;

/**
 * @Author: 程荣凯
 * @Date: 2018/6/20 21:26
 */
@Component
public class SgtPeppers implements CompactDisc{
    private String title = "SgtPeppers";
    private String artist = "The Beatles";
    public void play() {
        System.out.println(title+" By "+artist);
    }
}

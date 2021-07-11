package com.test.testweb.utils;

/**
 * @Author: wujianqinjian
 * @Date: 2021/7/4 5:16 下午
 */
public class SleepUtil {
    public static void sleep(int second){
        try {
            Thread.sleep(1000 * second);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

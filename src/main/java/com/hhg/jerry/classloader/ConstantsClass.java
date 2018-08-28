package com.hhg.jerry.classloader;

/**
 * Created by lina on 2018/8/27.
 */
public class ConstantsClass {
    static {
        System.out.println("ConstantsClass init...");
    }
    public static final String HI = "hi";
}

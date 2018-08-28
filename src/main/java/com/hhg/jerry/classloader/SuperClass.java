package com.hhg.jerry.classloader;

/**
 * Created by lina on 2018/8/27.
 */
public class SuperClass {
    static {
        System.out.println("Super Class static region");
        System.out.println(SuperClass.class.getName());
    }

    public static int value = 5;
}

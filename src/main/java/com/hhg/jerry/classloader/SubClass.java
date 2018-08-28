package com.hhg.jerry.classloader;

/**
 * Created by lina on 2018/8/27.
 */
public class SubClass extends SuperClass {
    static{
        System.out.println("SubClass static region invoked...");
    }
}

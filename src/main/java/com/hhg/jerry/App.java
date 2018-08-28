package com.hhg.jerry;

import com.hhg.jerry.classloader.ConstantsClass;
import com.hhg.jerry.classloader.SubClass;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println(SubClass.value);
        System.out.println(ConstantsClass.HI);
    }
}

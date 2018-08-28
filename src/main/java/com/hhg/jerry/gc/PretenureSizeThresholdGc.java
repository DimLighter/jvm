package com.hhg.jerry.gc;

/**
 * Created by lina on 2018/8/25.
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=3145728
 */
public class PretenureSizeThresholdGc {

    private static final int _1M = 1024 * 1024;

    public static void main(String[] args){
        System.out.println("enter........................................");
        byte[] bytes1;
        bytes1 = new byte[4*_1M];
    }
}

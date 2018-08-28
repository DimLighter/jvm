package com.hhg.jerry.gc;

/**
 * Created by lina on 2018/8/25.
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=1
 */
public class MaxTenuringThresholdGc {

    private static final int _1M = 1024 * 1024;

    public static void main(String[] args){
        System.out.println("enter........................................");
        byte[] bytes1,bytes2,bytes3;
        bytes1 = new byte[_1M/4];
        bytes2 = new byte[_1M * 4];
        bytes3 = new byte[_1M * 4];
        bytes3 = null;
        bytes3 = new byte[_1M * 4];
    }
}

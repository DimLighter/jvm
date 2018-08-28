package com.hhg.jerry.gc;

/**
 * Created by lina on 2018/8/25.
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=15
 * survivor中相同年龄对象大于一半 则大于等于该年龄的直接进入tenure space
 */
public class MaxTenuringThresholdGc1 {

    private static final int _1M = 1024 * 1024;

    public static void main(String[] args){
        System.out.println("enter........................................");
        byte[] bytes1,bytes2,bytes3,bytes4;
        bytes1 = new byte[_1M/4];
        bytes2 = new byte[_1M/4];
        bytes3 = new byte[_1M * 4];
        bytes4 = new byte[_1M * 4];
        bytes4 = null;
        bytes4 = new byte[_1M * 4];
    }
}

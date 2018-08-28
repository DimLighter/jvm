package com.hhg.jerry.gc;

/**
 * Created by lina on 2018/8/25.
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 */
public class VerboseGc {

    private static final int _1M = 1024 * 1024;

    public static void main(String[] args){
        System.out.println("enter........................................");
        byte[] bytes1,bytes2,bytes3,bytes4;
        bytes1 = new byte[2*_1M];
        bytes2 = new byte[2*_1M];
        bytes3 = new byte[2*_1M];
        bytes4 = new byte[4*_1M];  //minor gc
    }
}

package com.hhg.jerry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lina on 2018/8/22.
 * -XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class ConstantsPool {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        int i=0;
        try{
            while (true){
                list.add(String.valueOf(i++).intern());
            }
        }finally {
            System.out.println("i is : " + i);
        }

    }
}

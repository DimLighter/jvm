package com.hhg.jerry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lina on 2018/8/22.
 * -Xms10m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    static class DummyClass{

    }

    public static void main(String[] args){
        List<Object> list = new ArrayList<Object>();
        while (true){
            list.add(new DummyClass());
        }
    }
}

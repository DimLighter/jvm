package com.hhg.jerry.others;

/**
 * Created by lina on 2018/8/23.
 * -XX:StringTableSize=99991
 */
public class StringIntern {
    private Integer priInt;
    private static void priMethod(Integer a){

    }

    protected Integer proMethod(String s){
        try{
            int a=0;
            a = a/0;
        }finally {
            s = "dennis";
            s += "_ted";
        }
        return null;
    }

    public void pubMethod(Integer a, Integer b){

    }

    public static void main(String[] args){
        String s = "";
        for(int i=0;i<100;i++){
            s += "a";
        }

        String s1 = "1";
        String s2 = new String("1");
        s2.intern();
        System.out.println(s1 == s2);

        String s3 = new String("a") + new String("b");
        s3.intern();
        String s4 = "ab";
        System.out.println(s3 == s4);
        System.out.println(s3.intern() == s4);

        String s5 = new String("cd");
        s5.intern();
        String s6 = "cd";
        System.out.println(s5 == s6);
        System.out.println(s5.intern() == s6);

        String s7 = String.valueOf(333);
        s7.intern();
        String s8 = "333";
        System.out.println(s7 == s8);
        System.out.println(s7.intern() == s7);
    }
}

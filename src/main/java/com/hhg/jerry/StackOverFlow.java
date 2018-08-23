package com.hhg.jerry;

/**
 * Created by lina on 2018/8/22.
 * -Xss128k
 */
public class StackOverFlow {
    int length = 1;
    public static void main(String[] args){
        StackOverFlow stackOverFlow = new StackOverFlow();
        try{
            stackOverFlow.stackLengthWithParameter(1,1,1,1);
        }catch (StackOverflowError error){
            System.out.println("length:"+stackOverFlow.length);
            error.printStackTrace();
        }
    }

    public void stackLength(){
        length ++;
        stackLength();
    }

    public void stackLengthWithParameter(int a, int b, int c, int d){
        length ++;
        Integer ccc = 5;
        Integer bbb = 6;
        Integer aaa = 6;
        Integer ddd = 6;
        stackLengthWithParameter(a,b,c,d);
    }
}

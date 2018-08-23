package com.hhg.jerry;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by lining on 2018/8/23.
 * -XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class PermGenByCgLib {
    static class Dummy{
        public void add(){
            System.out.println("add");
        }

        public int get(int i){
            return i;
        }
    }

    public static void main(String[] args) {
        Dummy dummy = getEnhancedObject(Dummy.class);
//        dummy.get(10);
        permGenSpaceError();
        System.out.println("over");
    }

    public static void permGenSpaceError(){
        while (true) {
            getEnhancedObject(Dummy.class);
        }
    }

    public static <T> T getEnhancedObject(Class<? extends Object> cls){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setUseCache(false);
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("before");
                Object result =  methodProxy.invokeSuper(o, objects);
                System.out.println("after");
                return result;
            }
        });
        return (T)enhancer.create();
    }
}

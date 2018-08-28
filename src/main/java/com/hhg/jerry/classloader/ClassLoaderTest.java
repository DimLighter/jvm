package com.hhg.jerry.classloader;

import java.io.IOException;
import java.io.InputStream;
import java.io.SyncFailedException;

/**
 * Created by lina on 2018/8/28.
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws Exception{
        printSystemProperty();
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                InputStream inputStream = getClass().getResourceAsStream(fileName);
                if(inputStream == null)
                    return super.loadClass(name);
                try {
                    byte[] b = new byte[inputStream.available()];
                    inputStream.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };

        String className = "com.hhg.jerry.classloader.ClassLoaderTest";
        Object obj = classLoader.loadClass(className).newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof ClassLoaderTest);

        ClassLoader cld = ClassLoaderTest.class.getClassLoader();
        while (cld != null){
            System.out.println(cld);
            cld = cld.getParent();
        }
    }

    private static void printSystemProperty(){
        printPaths("sun.boot.class.path");
        printPaths("java.ext.dirs");
        printPaths("java.class.path");
    }

    private static void printPaths(String key){
        String paths = System.getProperty(key);
        System.out.println("Key is " + key + "----------------------------------------------------");
        for(String path : paths.split(";"))
            System.out.println(path);
        System.out.println();
    }
}

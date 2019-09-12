package com.youyuan.singleton;

/**
 * @author zhangyu
 * @version 1.0
 * @description 单例模式测试
 * @date 2018/11/25 19:40
 */
public class ClientTest {
    public static void main(String[] args) {
        SingletonTest1 st1One=SingletonTest1.getInstance();
        SingletonTest1 st1Two=SingletonTest1.getInstance();
        System.out.println("饿汉式单例:"+(st1One==st1Two));
        SingletonTest2 st2One=SingletonTest2.getInstance();
        SingletonTest2 st2Two=SingletonTest2.getInstance();
        System.out.println("懒汉式单例:"+(st2One==st2Two));
        SingletonTest3 st3One=SingletonTest3.getInstance();
        SingletonTest3 st3Two=SingletonTest3.getInstance();
        System.out.println("静态内部类单例:"+(st3One==st3Two));
        SingletonTest4 st4One=SingletonTest4.INSTANCE;
        SingletonTest4 st4Two=SingletonTest4.INSTANCE;
        System.out.println("枚举式单例:"+(st4One==st4Two));
    }
}

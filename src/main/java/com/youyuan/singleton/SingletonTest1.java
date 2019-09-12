package com.youyuan.singleton;

/**
 * @author zhangyu
 * @version 1.0
 * @description 单例模式:饿汉式(线程安全、调用率高、不能延迟加载)
 * @date 2018/11/25 17:57
 */
public class SingletonTest1 {
    private static SingletonTest1 instance=new SingletonTest1();
    private SingletonTest1(){}

    /**
     * 获取单例实例对象
     * @return 返回实例对象
     */
    public static SingletonTest1 getInstance(){
        return instance;
    }
}

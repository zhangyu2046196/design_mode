package com.youyuan.singleton;

/**
 * @author zhangyu
 * @version 1.0
 * @description 单例模式:懒汉式(线程安全、调用率不高、能延迟加载)
 * @date 2018/11/25 18:00
 */
public class SingletonTest2 {
    private static SingletonTest2 instance=null;
    private SingletonTest2(){}

    /**
     * 获取单例实例对象
     * @return 返回实例对象
     */
    public static SingletonTest2 getInstance(){
        if (instance!=null){
            return instance;
        }
        synchronized (SingletonTest2.class){
            if (instance==null){
                instance=new SingletonTest2();
            }
        }
        return instance;
    }
}

package com.youyuan.singleton;

/**
 * @author zhangyu
 * @version 1.0
 * @description 单例模式:静态内部类 (线程安全、调用效率高、不能延迟加载)
 *
 * 知识点
 *  1、静态内部类中因为没有static属性，所以在类加载器加载到jvm虚拟机的时候不会创建对象，实现了延迟加载
 *  2、静态内部类的对象属性定义为static final 类型, static类型代表内存中只能有一份  final类型代表变量值不能修改，保证线程安全
 *
 * @date 2018/11/25 19:24
 */
public class SingletonTest3 {
    private SingletonTest3(){}

    //静态内部类
    private static class SingletonInerClass{
        private static final SingletonTest3 instance=new SingletonTest3();
    }

    /**
     * 获取对象信息
     * @return 返回对象
     */
    public static SingletonTest3 getInstance(){
        return SingletonInerClass.instance;
    }
}

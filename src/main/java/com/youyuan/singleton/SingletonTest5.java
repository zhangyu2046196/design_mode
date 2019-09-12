package com.youyuan.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试通过反射和反序列化方式破解创建单例模式，和防止破解的方法 (此处用懒汉式的方式演示)
 *
 * 通过枚举类型创建的单例不能被破解，因为枚举类型是通过jvm底层创建
 *
 * @date 2018/11/25 20:25
 */
public class SingletonTest5 implements Serializable {
    private static final long serialVersionUID = 4338124522248343667L;
    private volatile static SingletonTest5 instance=null;
    private SingletonTest5(){
        //以下代码是防止通过反射的方式访问私有构造方法破解单例
        if (instance!=null){
            throw new RuntimeException("防止通过反射方式私有构造方法创建对象");
        }
    }

    /**
     * 获取单例实例
     * @return 返回对象
     */
    public static SingletonTest5 getInstance(){
        if (instance!=null){
            return instance;
        }
        if (instance==null){
            synchronized (SingletonTest5.class){
                if (instance==null){
                    instance=new SingletonTest5();
                }
            }
        }

        return instance;
    }

    //防止反序列化破解单例对象，反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建新对象！
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}

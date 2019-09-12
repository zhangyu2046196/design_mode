package com.youyuan.singleton;

/**
 * @author zhangyu
 * @version 1.0
 * @description 单例模式:枚举方式创建 (线程安全、调用率高、不能延迟加载)
 *
 * 知识点:
 *  枚举元素就是实例对象
 *  枚举本身就是单例模式
 *
 * @date 2018/11/25 19:34
 */
public enum SingletonTest4 {
    INSTANCE;

    /**
     * 处理业务的方法
     */
    public void service(){

    }
}

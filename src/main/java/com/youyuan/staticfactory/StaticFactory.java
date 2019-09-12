package com.youyuan.staticfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description
 * @date 2018/11/25 21:56
 */
public class StaticFactory {
    /**
     * 创建奥迪车
     * @return 返回奥迪车
     */
    public static Car createAudi(){
        return new Audi();
    }

    /**
     * 创建宝马车
     * @return 返回宝马车
     */
    public static Car createBmw(){
        return new Bmw();
    }
}

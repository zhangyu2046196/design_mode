package com.youyuan.decorator;

/**
 * @author zhangyu
 * @version 1.0
 * @description 普通汽车类
 * @date 2018/11/29 16:26
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("普通汽车在行驶......");
    }
}

package com.youyuan.factorymethod;

/**
 * @author zhangyu
 * @version 1.0
 * @description °ÂµÏ¹¤³§
 * @date 2018/11/26 22:00
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}

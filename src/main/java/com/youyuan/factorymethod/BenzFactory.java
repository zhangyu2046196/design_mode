package com.youyuan.factorymethod;

/**
 * @author zhangyu
 * @version 1.0
 * @description ���۹���
 * @date 2018/11/26 22:02
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}

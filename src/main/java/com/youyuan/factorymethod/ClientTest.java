package com.youyuan.factorymethod;

/**
 * @author zhangyu
 * @version 1.0
 * @description ≤‚ ‘π§æﬂ
 * @date 2018/11/26 22:01
 */
public class ClientTest {
    public static void main(String[] args) {
        Car audi=new AudiFactory().createCar();
        Car bmw=new BmwFactory().createCar();
        Car benz=new BenzFactory().createCar();
        audi.run();
        bmw.run();
        benz.run();
    }
}

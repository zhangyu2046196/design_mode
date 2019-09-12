package com.youyuan.decorator;

/**
 * @author zhangyu
 * @version 1.0
 * @description 装饰者模式测试
 * @date 2018/11/29 16:33
 */
public class ClientTest {

    public static void main(String[] args) {
        Car car=new Car();
        car.move();
        System.out.println("====================");
        FlyCar flyCar=new FlyCar(car);
        flyCar.move();
        System.out.println("====================");
        WaterCar waterCar=new WaterCar(car);
        waterCar.move();
        System.out.println("====================");
        AICar aiCar=new AICar(car);
        aiCar.move();
        System.out.println("========全部组装=====");
        AICar aiCar1=new AICar(new WaterCar(new FlyCar(new Car())));
        aiCar1.move();
    }

}

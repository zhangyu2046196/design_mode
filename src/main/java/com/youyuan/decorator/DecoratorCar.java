package com.youyuan.decorator;

/**
 * @author zhangyu
 * @version 1.0
 * @description 装饰者汽车类
 * @date 2018/11/29 16:27
 */
public class DecoratorCar implements ICar {
    //真实汽车对象
    private ICar car;
    public DecoratorCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

/**
 * 汽车添加飞功能
 */
class FlyCar extends DecoratorCar{

    public FlyCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("增加汽车飞行功能......");
    }
}

/**
 * 汽车添加智能功能
 */
class AICar extends DecoratorCar{

    public AICar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("增加汽车智能功能......");
    }
}

/**
 * 汽车增加潜水功能
 */
class WaterCar extends DecoratorCar{

    public WaterCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("增加汽车潜水功能......");
    }
}

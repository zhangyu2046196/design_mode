package com.youyuan.decorator;

/**
 * @author zhangyu
 * @version 1.0
 * @description װ����������
 * @date 2018/11/29 16:27
 */
public class DecoratorCar implements ICar {
    //��ʵ��������
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
 * ������ӷɹ���
 */
class FlyCar extends DecoratorCar{

    public FlyCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("�����������й���......");
    }
}

/**
 * ����������ܹ���
 */
class AICar extends DecoratorCar{

    public AICar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("�����������ܹ���......");
    }
}

/**
 * ��������Ǳˮ����
 */
class WaterCar extends DecoratorCar{

    public WaterCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("��������Ǳˮ����......");
    }
}

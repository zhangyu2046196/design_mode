package com.youyuan.decorator;

/**
 * @author zhangyu
 * @version 1.0
 * @description ��ͨ������
 * @date 2018/11/29 16:26
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("��ͨ��������ʻ......");
    }
}

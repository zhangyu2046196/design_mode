package com.youyuan.staticproxy;

/**
 * @author zhangyu
 * @version 1.0
 * @description ��ʵ��ɫ
 * @date 2018/11/28 21:10
 */
public class RealStar implements Star {
    @Override
    public void faceTack() {
        System.out.println("��ʵ��ɫ�տ�......");
    }

    @Override
    public void concludeStar() {
        System.out.println("��ʵ��ɫǩ��ͬ......");
    }

    @Override
    public void topTick() {
        System.out.println("��ʵ��ɫ��Ʊ......");
    }

    @Override
    public void sing() {
        System.out.println("��ʵ��ɫ����......");
    }

    @Override
    public void collectMoney() {
        System.out.println("��ʵ��ɫ�տ�......");
    }
}

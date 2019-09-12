package com.youyuan.staticproxy;

/**
 * @author zhangyu
 * @version 1.0
 * @description �����ɫ
 * @date 2018/11/28 21:12
 */
public class ProxyStar implements Star {
    /**
     * ��ʵ��ɫ��Ϊ�����ɫ������
     */
    private Star realStar;

    public ProxyStar(RealStar realStar) {
        this.realStar = realStar;
    }

    @Override
    public void faceTack() {
        System.out.println("�����ɫ��̸......");
    }

    @Override
    public void concludeStar() {
        System.out.println("�����ɫǩ��ͬ......");
    }

    @Override
    public void topTick() {
        System.out.println("�����ɫ��Ʊ......");
    }

    @Override
    public void sing() {
        System.out.println("��ʵ��ɫ����......");
    }

    @Override
    public void collectMoney() {
        System.out.println("�����ɫ�տ�......");
    }
}

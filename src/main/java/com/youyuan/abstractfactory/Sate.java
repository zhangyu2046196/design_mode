package com.youyuan.abstractfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description ���νӿ�
 * @date 2018/11/26 22:43
 */
public interface Sate {
    void message();
}

/**
 * �߼�����ʵ����
 */
class HightSate implements Sate{

    @Override
    public void message() {
        System.out.println("�߼�����ͨ��......");
    }
}

/**
 * �ͼ�����ʵ����
 */
class LowSate implements Sate{

    @Override
    public void message() {
        System.out.println("�ͼ����β�ͨ��......");
    }
}

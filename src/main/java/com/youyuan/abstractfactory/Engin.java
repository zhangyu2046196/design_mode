package com.youyuan.abstractfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description ����ӿ�
 * @date 2018/11/26 22:42
 */
public interface Engin {

    void start();
}

/**
 * �߼�����ʵ����
 */
class HightEngin implements Engin{

    @Override
    public void start() {
        System.out.println("�߼������ܵÿ�......");
    }
}

/**
 * �ͼ�����ʵ����
 */
class LowEngin implements Engin{

    @Override
    public void start() {
        System.out.println("�ͼ������ܵ���......");
    }
}

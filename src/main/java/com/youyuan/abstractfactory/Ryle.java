package com.youyuan.abstractfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description ��̥�ӿ�
 * @date 2018/11/26 22:43
 */
public interface Ryle {
    void run();
}

/**
 * �߼���̥ʵ����
 */
class HightRyle implements Ryle{

    @Override
    public void run() {
        System.out.println("�߼���̥������ĥ......");
    }
}

/**
 * �ͼ���̥ʵ����
 */
class LowRyle implements Ryle{

    @Override
    public void run() {
        System.out.println("�ͼ���̥�������Ҳ���ĥ");
    }
}

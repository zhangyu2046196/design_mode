package com.youyuan.adapter;

/**
 * @author zhangyu
 * @version 1.0
 * @description ���������� ͨ����������Ķ��󴫵ݽ���
 * @date 2018/11/27 22:34
 */
public class Adapter2 implements Target {
    //���������
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.message();
    }
}

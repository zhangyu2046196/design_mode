package com.youyuan.adapter;

/**
 * @author zhangyu
 * @version 1.0
 * @description ������ģʽ����
 * @date 2018/11/27 22:36
 */
public class ClientTest {
    public static void main(String[] args) {
        //������������
        Target target=new Adapter1();
        target.request();

        //��������������
        Adapter2 adapter2=new Adapter2(new Adaptee());
        adapter2.request();
    }
}

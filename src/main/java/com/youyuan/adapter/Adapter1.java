package com.youyuan.adapter;

/**
 * @author zhangyu
 * @version 1.0
 * @description ��������  ͨ���̳б�����Ķ����ʵ��Ŀ��ӿ�
 * @date 2018/11/27 22:33
 */
public class Adapter1 extends Adaptee implements Target {
    @Override
    public void request() {
        super.message();
    }
}

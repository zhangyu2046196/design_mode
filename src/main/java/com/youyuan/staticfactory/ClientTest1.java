package com.youyuan.staticfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description ��̬����ģʽ����
 * ����ģʽ���Ǵ����ߺ͵����߽�������ʵ������ʽ�ù�����������new
 * ��̬�������ǹ����ķ����Ǿ�̬��������ʵ���ཻ������������ʵ��������Ĵ����͹��������߲��ù���ʵ����
 * @date 2018/11/25 22:00
 */
public class ClientTest1 {
    public static void main(String[] args) {
        Car audi=StaticFactory.createAudi();//�����µ϶���
        Car bmw=StaticFactory.createBmw();//�����������
        audi.run();
        bmw.run();
    }
}

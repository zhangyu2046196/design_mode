package com.youyuan.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author zhangyu
 * @version 1.0
 * @description ��̬�������
 *
 * ģ����ǡ�������
 *
 * @date 2018/11/28 21:55
 */
public class ClientTest {

    public static void main(String[] args) {
        //������ʵ��ɫ
        RealStar realStar=new RealStar();
        //����������ʵ����
        StarHandler starHandler=new StarHandler(realStar);
        //��̬����������,��Ҫָ���������ӿ�ʵ�������
        Star star= (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},starHandler);
        star.faceTack();
        star.concludeStar();
        star.topTick();
        star.sing();
        star.collectMoney();
    }

}

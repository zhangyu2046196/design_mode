package com.youyuan.singleton;

/**
 * @author zhangyu
 * @version 1.0
 * @description ����ģʽ:����ʽ(�̰߳�ȫ�������ʸߡ������ӳټ���)
 * @date 2018/11/25 17:57
 */
public class SingletonTest1 {
    private static SingletonTest1 instance=new SingletonTest1();
    private SingletonTest1(){}

    /**
     * ��ȡ����ʵ������
     * @return ����ʵ������
     */
    public static SingletonTest1 getInstance(){
        return instance;
    }
}

package com.youyuan.singleton;

/**
 * @author zhangyu
 * @version 1.0
 * @description ����ģʽ:��̬�ڲ��� (�̰߳�ȫ������Ч�ʸߡ������ӳټ���)
 *
 * ֪ʶ��
 *  1����̬�ڲ�������Ϊû��static���ԣ�����������������ص�jvm�������ʱ�򲻻ᴴ������ʵ�����ӳټ���
 *  2����̬�ڲ���Ķ������Զ���Ϊstatic final ����, static���ʹ����ڴ���ֻ����һ��  final���ʹ������ֵ�����޸ģ���֤�̰߳�ȫ
 *
 * @date 2018/11/25 19:24
 */
public class SingletonTest3 {
    private SingletonTest3(){}

    //��̬�ڲ���
    private static class SingletonInerClass{
        private static final SingletonTest3 instance=new SingletonTest3();
    }

    /**
     * ��ȡ������Ϣ
     * @return ���ض���
     */
    public static SingletonTest3 getInstance(){
        return SingletonInerClass.instance;
    }
}

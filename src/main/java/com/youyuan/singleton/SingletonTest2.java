package com.youyuan.singleton;

/**
 * @author zhangyu
 * @version 1.0
 * @description ����ģʽ:����ʽ(�̰߳�ȫ�������ʲ��ߡ����ӳټ���)
 * @date 2018/11/25 18:00
 */
public class SingletonTest2 {
    private static SingletonTest2 instance=null;
    private SingletonTest2(){}

    /**
     * ��ȡ����ʵ������
     * @return ����ʵ������
     */
    public static SingletonTest2 getInstance(){
        if (instance!=null){
            return instance;
        }
        synchronized (SingletonTest2.class){
            if (instance==null){
                instance=new SingletonTest2();
            }
        }
        return instance;
    }
}

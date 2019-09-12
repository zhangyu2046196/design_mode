package com.youyuan.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author zhangyu
 * @version 1.0
 * @description ����ͨ������ͷ����л���ʽ�ƽⴴ������ģʽ���ͷ�ֹ�ƽ�ķ��� (�˴�������ʽ�ķ�ʽ��ʾ)
 *
 * ͨ��ö�����ʹ����ĵ������ܱ��ƽ⣬��Ϊö��������ͨ��jvm�ײ㴴��
 *
 * @date 2018/11/25 20:25
 */
public class SingletonTest5 implements Serializable {
    private static final long serialVersionUID = 4338124522248343667L;
    private volatile static SingletonTest5 instance=null;
    private SingletonTest5(){
        //���´����Ƿ�ֹͨ������ķ�ʽ����˽�й��췽���ƽⵥ��
        if (instance!=null){
            throw new RuntimeException("��ֹͨ�����䷽ʽ˽�й��췽����������");
        }
    }

    /**
     * ��ȡ����ʵ��
     * @return ���ض���
     */
    public static SingletonTest5 getInstance(){
        if (instance!=null){
            return instance;
        }
        if (instance==null){
            synchronized (SingletonTest5.class){
                if (instance==null){
                    instance=new SingletonTest5();
                }
            }
        }

        return instance;
    }

    //��ֹ�����л��ƽⵥ�����󣬷����л�ʱ�����������readResolve()��ֱ�ӷ��ش˷���ָ���Ķ��󡣶�����Ҫ�����ٴ����¶���
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}

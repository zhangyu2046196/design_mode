package com.youyuan.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhangyu
 * @version 1.0
 * @description ��������Ҫʵ��InvocationHandler�ӿ�
 * @date 2018/11/28 21:58
 */
public class StarHandler implements InvocationHandler {
    //��ʵ��ɫ
    private Object object;

    public StarHandler(Object object) {
        this.object = object;
    }
    //��дinvoke������ִ����ʵ��ɫ�ķ���
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //ִ����ʵ��ɫ�ķ���
        method.invoke(object,args);
        return null;
    }
}

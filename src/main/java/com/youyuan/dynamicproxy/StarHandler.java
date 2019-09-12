package com.youyuan.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhangyu
 * @version 1.0
 * @description 处理器需要实现InvocationHandler接口
 * @date 2018/11/28 21:58
 */
public class StarHandler implements InvocationHandler {
    //真实角色
    private Object object;

    public StarHandler(Object object) {
        this.object = object;
    }
    //重写invoke方法来执行真实角色的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行真实角色的方法
        method.invoke(object,args);
        return null;
    }
}

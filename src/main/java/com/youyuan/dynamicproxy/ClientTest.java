package com.youyuan.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author zhangyu
 * @version 1.0
 * @description 动态代理测试
 *
 * 模拟歌星、经纪人
 *
 * @date 2018/11/28 21:55
 */
public class ClientTest {

    public static void main(String[] args) {
        //创建真实角色
        RealStar realStar=new RealStar();
        //创建处理器实现类
        StarHandler starHandler=new StarHandler(realStar);
        //动态创建代理类,需要指定处理器接口实现类对象
        Star star= (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},starHandler);
        star.faceTack();
        star.concludeStar();
        star.topTick();
        star.sing();
        star.collectMoney();
    }

}

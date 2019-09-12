package com.youyuan.prototype;

import java.util.Date;

/**
 * @author zhangyu
 * @version 1.0
 * @description prototype原型模式 深克隆测试
 * @date 2018/11/27 19:15
 */
public class ClientTest2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date=new Date(98798789789798L);
        sheep1 s1=new sheep1("小莉",date);
        sheep1 s2= (sheep1) s1.clone();//克隆一个新的对象
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("======================");
        date.setTime(979878797979L);
        System.out.println("s1赋值后s1:"+s1);
        System.out.println("s1赋值后s2:"+s2);
    }
}

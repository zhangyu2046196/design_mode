package com.youyuan.prototype;

import java.util.Date;

/**
 * @author zhangyu
 * @version 1.0
 * @description prototype浅克隆测试
 * @date 2018/11/27 17:56
 */
public class ClientTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date=new Date(753725765657L);
        sheep s1=new sheep("多利",date);
        sheep s2= (sheep) s1.clone();//克隆出一个新对象
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("==========================");
        date.setTime(88998888808988989L);//这样修改只是改了值，不会修改引用地址
        System.out.println("修改s1的date值后s1:"+s1);
        System.out.println("修改s2的date值后s2:"+s2);
        System.out.println("==========================");
        date.setTime(898892122198989898L);
        System.out.println("修改s2的date值后s1:"+s1);
        System.out.println("修改s2的date值后s2:"+s2);

    }
}

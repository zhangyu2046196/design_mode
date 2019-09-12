package com.youyuan.prototype;

import java.util.Date;

/**
 * @author zhangyu
 * @version 1.0
 * @description prototypeԭ��ģʽ ���¡����
 * @date 2018/11/27 19:15
 */
public class ClientTest2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date=new Date(98798789789798L);
        sheep1 s1=new sheep1("С��",date);
        sheep1 s2= (sheep1) s1.clone();//��¡һ���µĶ���
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("======================");
        date.setTime(979878797979L);
        System.out.println("s1��ֵ��s1:"+s1);
        System.out.println("s1��ֵ��s2:"+s2);
    }
}

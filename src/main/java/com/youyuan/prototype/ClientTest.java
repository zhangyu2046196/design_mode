package com.youyuan.prototype;

import java.util.Date;

/**
 * @author zhangyu
 * @version 1.0
 * @description prototypeǳ��¡����
 * @date 2018/11/27 17:56
 */
public class ClientTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date=new Date(753725765657L);
        sheep s1=new sheep("����",date);
        sheep s2= (sheep) s1.clone();//��¡��һ���¶���
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("==========================");
        date.setTime(88998888808988989L);//�����޸�ֻ�Ǹ���ֵ�������޸����õ�ַ
        System.out.println("�޸�s1��dateֵ��s1:"+s1);
        System.out.println("�޸�s2��dateֵ��s2:"+s2);
        System.out.println("==========================");
        date.setTime(898892122198989898L);
        System.out.println("�޸�s2��dateֵ��s1:"+s1);
        System.out.println("�޸�s2��dateֵ��s2:"+s2);

    }
}

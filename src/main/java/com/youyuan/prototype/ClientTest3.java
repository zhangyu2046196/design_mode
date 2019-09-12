package com.youyuan.prototype;

import java.io.*;
import java.util.Date;

/**
 * @author zhangyu
 * @version 1.0
 * @description prototypeԭ��ģʽ  ͨ�����л��ͷ����л�ʵ�����¡
 * @date 2018/11/27 19:57
 */
public class ClientTest3 {
    public static void main(String[] args) throws Exception {
        Date date=new Date(98798880899899l);
        sheep s1=new sheep("����",date);
        System.out.println("s1:"+s1);

        //����ͨ�����л��ͷ����л��ķ�ʽʵ��ԭ��ģʽ�����¡
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(s1);
        byte[] bytes=bao.toByteArray();//��s1�������л�������s1�����е�����
        //�����Ƿ����л�
        ByteArrayInputStream bio=new ByteArrayInputStream(bytes);
        ObjectInputStream ois=new ObjectInputStream(bio);
        sheep s2= (sheep) ois.readObject();

        System.out.println("s2:"+s2);
        System.out.println("===================");
        date.setTime(8080897987980998989L);
        System.out.println("�޸�date��s1:"+s1);
        System.out.println("�޸�date��s2:"+s2);
    }
}

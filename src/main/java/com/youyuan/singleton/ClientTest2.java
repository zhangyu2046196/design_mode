package com.youyuan.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zhangyu
 * @version 1.0
 * @description ����ͨ������ͷ����еķ�ʽ�ƽⴴ�������ķ�ʽ�ͷ�ֹ�ƽ�ķ���
 * ͨ��ö�ٷ�ʽ�����ĵ���ģʽ���ܱ��ƽ�
 * @date 2018/11/25 20:30
 */
public class ClientTest2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException {
        SingletonTest5 s1=SingletonTest5.getInstance();
        SingletonTest5 s2=SingletonTest5.getInstance();
        System.out.println("������ʽ��ȡ����:"+(s1==s2));

        //ͨ�����䷽ʽ�ƽⵥ����ʽ
/*        Class<SingletonTest5> clazz= (Class<SingletonTest5>) Class.forName("com.youyuan.singleton.SingletonTest5");
        Constructor<SingletonTest5> c = clazz.getDeclaredConstructor(null);//��ȡ���췽��
        c.setAccessible(true);//����Ȩ�޼�飬����ֱ�ӷ���˽�й��췽��
        SingletonTest5 s3= (SingletonTest5) c.newInstance();//���䴴������
        SingletonTest5 s4= (SingletonTest5) c.newInstance();//���䴴������
        System.out.println(s3);
        System.out.println(s4);*/

        //ͨ�������л��ķ�ʽ�ƽⵥ��ģʽ
        FileOutputStream fos = new FileOutputStream("c:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/a.txt"));
        SingletonTest5 s3 =  (SingletonTest5) ois.readObject();
        System.out.println(s3);
    }
}

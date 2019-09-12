package com.youyuan.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试通过反射和反序列的方式破解创建单例的方式和防止破解的方法
 * 通过枚举方式创建的单例模式不能被破解
 * @date 2018/11/25 20:30
 */
public class ClientTest2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException {
        SingletonTest5 s1=SingletonTest5.getInstance();
        SingletonTest5 s2=SingletonTest5.getInstance();
        System.out.println("正常方式获取单例:"+(s1==s2));

        //通过反射方式破解单例方式
/*        Class<SingletonTest5> clazz= (Class<SingletonTest5>) Class.forName("com.youyuan.singleton.SingletonTest5");
        Constructor<SingletonTest5> c = clazz.getDeclaredConstructor(null);//获取构造方法
        c.setAccessible(true);//跳过权限检查，可以直接访问私有构造方法
        SingletonTest5 s3= (SingletonTest5) c.newInstance();//反射创建对象
        SingletonTest5 s4= (SingletonTest5) c.newInstance();//反射创建对象
        System.out.println(s3);
        System.out.println(s4);*/

        //通过反序列化的方式破解单例模式
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

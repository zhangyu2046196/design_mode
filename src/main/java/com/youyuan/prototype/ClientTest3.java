package com.youyuan.prototype;

import java.io.*;
import java.util.Date;

/**
 * @author zhangyu
 * @version 1.0
 * @description prototype原型模式  通过序列化和反序列化实现深克隆
 * @date 2018/11/27 19:57
 */
public class ClientTest3 {
    public static void main(String[] args) throws Exception {
        Date date=new Date(98798880899899l);
        sheep s1=new sheep("多利",date);
        System.out.println("s1:"+s1);

        //以下通过序列化和反序列化的方式实现原型模式的深克隆
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(s1);
        byte[] bytes=bao.toByteArray();//将s1对象序列化，包含s1对象中的属性
        //以下是反序列化
        ByteArrayInputStream bio=new ByteArrayInputStream(bytes);
        ObjectInputStream ois=new ObjectInputStream(bio);
        sheep s2= (sheep) ois.readObject();

        System.out.println("s2:"+s2);
        System.out.println("===================");
        date.setTime(8080897987980998989L);
        System.out.println("修改date后s1:"+s1);
        System.out.println("修改date后s2:"+s2);
    }
}

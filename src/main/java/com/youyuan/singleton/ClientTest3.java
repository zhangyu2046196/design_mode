package com.youyuan.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhangyu
 * @version 1.0
 * @description ͨ��CountDownLatch�����̲߳��Դ���������Ч��
 * @date 2018/11/25 20:53
 */
public class ClientTest3 {
    public static void main(String[] args) throws InterruptedException {
        int number=10;
        final CountDownLatch countDownLatch=new CountDownLatch(number);//�߳�����ԭ�������߳��жϣ�countdownlatch�����и�������������һ���̼߳�������1�����߳�ִ�����������1����������Ϊ0�����߳�ȫ��ִ����
        long start=System.currentTimeMillis();
        //ѭ��number��
        for (int i=1;i<=number;i++){
            new Thread(()->{
                for (int j=1;j<=1000000;j++){
                    //Object obj1=SingletonTest1.getInstance();
                    //Object obj2=SingletonTest2.getInstance();
                    //Object obj3=SingletonTest3.getInstance();
                    Object obj4=SingletonTest4.INSTANCE;
                }
                countDownLatch.countDown();//��������1
            }).start();
        }
        //���߳��жϵȴ�
        countDownLatch.await();
        long end=System.currentTimeMillis();
        System.out.println("��ʱ:"+(end-start)+"����");
    }
}

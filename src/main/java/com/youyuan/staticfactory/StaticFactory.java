package com.youyuan.staticfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description
 * @date 2018/11/25 21:56
 */
public class StaticFactory {
    /**
     * �����µϳ�
     * @return ���ذµϳ�
     */
    public static Car createAudi(){
        return new Audi();
    }

    /**
     * ��������
     * @return ���ر���
     */
    public static Car createBmw(){
        return new Bmw();
    }
}

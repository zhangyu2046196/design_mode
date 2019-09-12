package com.youyuan.abstractfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description ��������
 * @date 2018/11/26 22:49
 */
public interface CarFactory {
    /**
     * ��������ӿ�
     * @return ��������bean
     */
    Engin createEngin();

    /**
     * �������νӿ�
     * @return ��������bean
     */
    Sate createSate();

    /**
     * ������̥�ӿ�
     * @return ������̥bean
     */
    Ryle createRyle();
}

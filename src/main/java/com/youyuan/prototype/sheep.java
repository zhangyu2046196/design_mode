package com.youyuan.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangyu
 * @version 1.0
 * @description ԭ��ģʽ��ԭ����bean  ǳ��¡
 *
 * ԭ��ģʽ����ָ��ԭ������һ�����¶��󣬸��Ƴ��Ķ�����ԭ���������ֵ�����Ե�ֵһ������new����ͬ����new���¶����������Ĭ��ֵ
 *         ����¡���Ķ��������ֵ��ԭ���������ֵ��ͬ
 * ǳ��¡: ��¡���Ķ�����������õ���ԭ��������Եĵ�ַ ,ǳ��¡�󲻹���ԭ�����ǿ�¡���¶���ֻҪ�޸�����ֵ(���Եĵ�ַ���ܸ�)��ԭ������¿�¡�Ķ�������ֵ�����
 * ���¡����¡���Ķ�����������õ����´�ԭ�������Կ�¡���������Եĵ�ַ
 *
 * ʵ��ԭ��ģʽ����:
 *  ʵ��Cloneable�ӿڣ���дObject��clone����
 *
 * @date 2018/11/27 17:47
 */
public class sheep implements Cloneable,Serializable {
    private static final long serialVersionUID = 466268622764157583L;
    //����
    private String name;
    //ʱ��
    private Date birday;

    //��дclone����ʵ�ֿ�¡
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public sheep(String name, Date birday) {
        this.name = name;
        this.birday = birday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirday() {
        return birday;
    }

    public void setBirday(Date birday) {
        this.birday = birday;
    }

    @Override
    public String toString() {
        return "sheep{" +
                "name='" + name + '\'' +
                ", birday=" + birday +
                '}';
    }
}

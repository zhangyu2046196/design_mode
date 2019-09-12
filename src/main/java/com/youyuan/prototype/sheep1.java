package com.youyuan.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangyu
 * @version 1.0
 * @description ԭ��ģʽbean  ���¡
 *
 * ԭ��ģʽ����ָ��ԭ������һ�����¶��󣬸��Ƴ��Ķ�����ԭ���������ֵ�����Ե�ֵһ������new����ͬ����new���¶����������Ĭ��ֵ
 *         ����¡���Ķ��������ֵ��ԭ���������ֵ��ͬ
 * ǳ��¡: ��¡���Ķ�����������õ���ԭ��������Եĵ�ַ ,ǳ��¡�󲻹���ԭ�����ǿ�¡���¶���ֻҪ�޸�����ֵ(���Եĵ�ַ���ܸ�)��ԭ������¿�¡�Ķ�������ֵ�����
 * ���¡����¡���Ķ�����������õ����´�ԭ�������Կ�¡���������Եĵ�ַ
 *
 * ʵ��ԭ��ģʽ����:
 * ʵ��Cloneable�ӿڣ���дObject��clone����
 *
 *
 * @date 2018/11/27 19:10
 */
public class sheep1 implements Cloneable,Serializable {
    private static final long serialVersionUID = 6796808152570027652L;
    //����
    private String name;
    //����
    private Date birday;

    //���ڸ��ƿ�¡�������¡��ʽ
    @Override
    protected Object clone() throws CloneNotSupportedException {
        sheep1 s= (com.youyuan.prototype.sheep1) super.clone();
        s.setBirday(new Date(97987988889797L));//���¡��date�������¸�ֵһ���µĶ����ַ�������޸ĺ�Ͳ���Ӱ��ԭ����
        return s;
    }

    public sheep1(String name, Date birday) {
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
        return "sheep1{" +
                "name='" + name + '\'' +
                ", birday=" + birday +
                '}';
    }
}

package com.youyuan.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyu
 * @version 1.0
 * @description �ļ�������
 * @date 2018/11/29 14:11
 */
public class Fold implements AbsractFile {
    //��������
    private String name;
    //�洢�ӽڵ�
    private List<AbsractFile> list=new ArrayList<AbsractFile>();

    public Fold(String name) {
        this.name = name;
    }

    /**
     * ���
     */
    public void add(AbsractFile absractFile){
        list.add(absractFile);
    }

    /**
     * ɾ��
     * @param absractFile
     */
    public void remove(AbsractFile absractFile){
        list.remove(absractFile);
    }

    /**
     * ��ȡȫ���ӽڵ�
      * @return �����ӽڵ��б�
     */
    public List<AbsractFile> getList() {
        return list;
    }

    /**
     * ��ȡ�ڵ���Ϣ
     * @param index �±�
     * @return ���ز�ѯ��Ľڵ�
     */
    public AbsractFile get(int index){
        return list.get(index);
    }

    @Override
    public void killVure() {
        System.out.println("�ļ��в�ɱ"+name);
        for (AbsractFile a:list){
            a.killVure();//�ݹ�
        }
    }
}

package com.youyuan.composite;

/**
 * @author zhangyu
 * @version 1.0
 * @description ��ƵҶ�ӽڵ�
 * @date 2018/11/29 14:08
 */
public class VedioFile implements AbsractFile {
    //��Ƶ����
    private String name;

    public VedioFile(String name) {
        this.name = name;
    }

    @Override
    public void killVure() {
        System.out.println("��Ƶɱ����"+name);
    }
}

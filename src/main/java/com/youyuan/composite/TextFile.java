package com.youyuan.composite;

/**
 * @author zhangyu
 * @version 1.0
 * @description �ļ�Ҷ�ӽڵ�
 * @date 2018/11/29 14:08
 */
public class TextFile implements AbsractFile {
    //�ļ�����
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVure() {
        System.out.println("�ļ�ɱ����"+name);
    }
}

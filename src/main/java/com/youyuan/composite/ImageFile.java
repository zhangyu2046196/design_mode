package com.youyuan.composite;

/**
 * @author zhangyu
 * @version 1.0
 * @description ͼƬҶ�ӽڵ�
 * @date 2018/11/29 14:08
 */
public class ImageFile implements AbsractFile {
    //ͼƬ����
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVure() {
        System.out.println("ͼƬɱ����"+name);
    }
}

package com.youyuan.composite;

/**
 * @author zhangyu
 * @version 1.0
 * @description Í¼Æ¬Ò¶×Ó½Úµã
 * @date 2018/11/29 14:08
 */
public class ImageFile implements AbsractFile {
    //Í¼Æ¬Ãû×Ö
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVure() {
        System.out.println("Í¼Æ¬É±¶¾£º"+name);
    }
}

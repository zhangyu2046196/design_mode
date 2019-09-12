package com.youyuan.composite;

/**
 * @author zhangyu
 * @version 1.0
 * @description 视频叶子节点
 * @date 2018/11/29 14:08
 */
public class VedioFile implements AbsractFile {
    //视频名字
    private String name;

    public VedioFile(String name) {
        this.name = name;
    }

    @Override
    public void killVure() {
        System.out.println("视频杀毒："+name);
    }
}

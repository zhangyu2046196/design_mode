package com.youyuan.composite;

/**
 * @author zhangyu
 * @version 1.0
 * @description 文件叶子节点
 * @date 2018/11/29 14:08
 */
public class TextFile implements AbsractFile {
    //文件名字
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVure() {
        System.out.println("文件杀毒："+name);
    }
}

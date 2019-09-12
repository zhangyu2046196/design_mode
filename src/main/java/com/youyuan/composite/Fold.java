package com.youyuan.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyu
 * @version 1.0
 * @description 文件夹容器
 * @date 2018/11/29 14:11
 */
public class Fold implements AbsractFile {
    //容器名字
    private String name;
    //存储子节点
    private List<AbsractFile> list=new ArrayList<AbsractFile>();

    public Fold(String name) {
        this.name = name;
    }

    /**
     * 添加
     */
    public void add(AbsractFile absractFile){
        list.add(absractFile);
    }

    /**
     * 删除
     * @param absractFile
     */
    public void remove(AbsractFile absractFile){
        list.remove(absractFile);
    }

    /**
     * 获取全部子节点
      * @return 返回子节点列表
     */
    public List<AbsractFile> getList() {
        return list;
    }

    /**
     * 获取节点信息
     * @param index 下标
     * @return 返回查询后的节点
     */
    public AbsractFile get(int index){
        return list.get(index);
    }

    @Override
    public void killVure() {
        System.out.println("文件夹查杀"+name);
        for (AbsractFile a:list){
            a.killVure();//递归
        }
    }
}

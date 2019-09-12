package com.youyuan.composite;

import java.util.concurrent.ForkJoinTask;

/**
 * @author zhangyu
 * @version 1.0
 * @description 组合模式测试 (组合模式使用与处理树型结构数据)
 * @date 2018/11/29 14:20
 */
public class ClientTest {

    public static void main(String[] args) {
        ImageFile imageFile=new ImageFile("海报");
        TextFile textFile=new TextFile("报表");
        VedioFile vedioFile=new VedioFile("电影");
        Fold fold=new Fold("收藏夹");
        fold.add(textFile);
        fold.add(vedioFile);

        imageFile.killVure();
        fold.killVure();
    }

}

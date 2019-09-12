package com.youyuan.bridge;

/**
 * @author zhangyu
 * @version 1.0
 * @description 电脑父类
 * @date 2018/11/29 11:33
 */
public class Computer {
    //品牌
    private Brank brank;

    public Computer(Brank brank) {
        this.brank = brank;
    }

    /**
     * 销售方法
     */
    public void sale(){
        brank.sale();
    }
}

/**
 * 台式机
 */
class DeskTop extends Computer{

    public DeskTop(Brank brank) {
        super(brank);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}

/**
 * 笔记本
 */
class NoteBook extends Computer{

    public NoteBook(Brank brank) {
        super(brank);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}

/**
 * pad
 */
class Pad extends Computer{

    public Pad(Brank brank) {
        super(brank);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售pad");
    }
}

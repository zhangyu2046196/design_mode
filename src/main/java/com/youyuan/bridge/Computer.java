package com.youyuan.bridge;

/**
 * @author zhangyu
 * @version 1.0
 * @description ���Ը���
 * @date 2018/11/29 11:33
 */
public class Computer {
    //Ʒ��
    private Brank brank;

    public Computer(Brank brank) {
        this.brank = brank;
    }

    /**
     * ���۷���
     */
    public void sale(){
        brank.sale();
    }
}

/**
 * ̨ʽ��
 */
class DeskTop extends Computer{

    public DeskTop(Brank brank) {
        super(brank);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("����̨ʽ��");
    }
}

/**
 * �ʼǱ�
 */
class NoteBook extends Computer{

    public NoteBook(Brank brank) {
        super(brank);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("���۱ʼǱ�");
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
        System.out.println("����pad");
    }
}

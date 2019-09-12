package com.youyuan.prototype;

/**
 * @author zhangyu
 * @version 1.0
 * @description new�����ԭ��ģʽclone��¡�ķ�ʽ���ܶԱ�
 * @date 2018/11/27 20:10
 */
public class ClientTest5 {

    public static void main(String[] args) {
        int size=1000;
        createNew(size);
        createClone(size);
    }

    /**
     * new�ķ�ʽ���������ʱ
     * @param size ����������
     */
    public static void createNew(int size){
        long start=System.currentTimeMillis();
        for (int i=1;i<=size;i++){
            Book b=new Book();
        }
        long end=System.currentTimeMillis();
        System.out.println("new����ʽ��ʱ:"+(end-start));
    }

    /**
     * ԭ��ģʽ���������ʱ
     * @param size ������������
     */
    public static void createClone(int size){
        long start=System.currentTimeMillis();
        Book b=new Book();
        for (int i=1;i<=size;i++){
            try {
                Book tmp= (Book) b.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("clone��¡�����ʱ:"+(end-start));
    }

}

/**
 * ����bean
 */
class Book implements Cloneable{
    public Book(){
        try {
            //ģ�������ӳ�
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //��¡
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

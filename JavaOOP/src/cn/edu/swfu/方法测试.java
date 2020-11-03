package cn.edu.swfu;

public class 方法测试 {

    public static void main(String[] args) {
        //final
        final int a=17;
        //a=18; //值不可以改变



        静态方法 obj=new 静态方法();
        int k=obj.sumTwo(10,20); //普通方法必须通过对象调用
        System.out.println("k = " + k);

        //静态下可以不创建对象直接调用
        静态方法.sum(1,9);

    }
}

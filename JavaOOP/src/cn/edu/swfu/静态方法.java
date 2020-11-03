package cn.edu.swfu;

public class 静态方法 {
    //静态变量
    private String name;
    private static String address;//静态变量


    /**
     * 1.静态变量能被静态方法直接调用
     * 2.非静态变量不能被静态方法调用
     * @param a
     * @param b
     * @return
     */

      //静态方法 加static 修饰
    public static int sum(int a,int b){
        String s=address;
        return a+b;

    }
     //普通方法
    public int sumTwo(int a,int b){
        return a+b;
    }

}

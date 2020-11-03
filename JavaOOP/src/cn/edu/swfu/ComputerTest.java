package cn.edu.swfu;

public class ComputerTest {
    public static void main(String[] args) {
        //创建computer对象 对象名m
        Computer m=new Computer();
        //调用方法   对象名.方法名
        m.say();//无参数
        m.run();
        m.sum(10,20);

        int x=50;
        int y=100;
        m.sum(x,y);

        m.total(10,20,545);

        m.demo(10.1,4);

        System.out.println("+++++++++++++++");
        int k2=m.aaa(3,5);
        System.out.println("k2 = " + k2);

    }
}

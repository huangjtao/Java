package cn.edu.swfu;

public class 计算器Test {
    public static void main(String[] args) {
        计算器 m = new 计算器();
        int k = m.sumOne(10, 20, 30);
        System.out.println("k = " + k);

        double k1=m.sumTwo(99.9,15,20);
        System.out.println("k1 = " + k1);

        int k3=m.calculate(10,'+',20);
        System.out.println("k3 = " + k3);
    }
}

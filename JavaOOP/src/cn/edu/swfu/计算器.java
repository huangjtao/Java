package cn.edu.swfu;

public class 计算器 {
    /**
     * 做完一题测试一题
     * 1.方法名 sumOne  计算三个整数的和 并返回结果
     * 2.方法名 sumTwo  计算一个小数乘以一个整数 减去一个整数的结果
     * 3.方法名 calculate 传入一个整数 一个char字符 一个整数 根据传入的'+' - * /
     *                  字符进行数学运算使用switch语句
     */

    public static int sumOne(int a,int b,int c) {
        return a+b+c;
    }

    public static double sumTwo(double a,int b,int c){
        return a*b-c;
    }

    public static int calculate(int a,char b,int c){
        int w=0;//计算结果
        switch (b) {
            case '+':
                w = a + c;
                break;
            case '-':
                w = a - c;
                break;
            case '*':
                w=a*c;
            case '/':
                w=a/b;
            //...
            default:
                System.out.println("瓜娃子");
                break;
        }
        return w;
    }
}

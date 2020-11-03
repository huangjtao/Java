package cn.edu.swfu;

public class UserTest {

    public static void main(String[] args) {
         //new 创建对象
        //格式：类名 变量名（对象名）=new 类名()
        User a=new User();
        a.age=18;
        a.sex='♂';
        a.name="东方月初";
        //a.money=9.99;


        a.name="蔡徐坤";
        a.age=18;
        a.sex='♂';
        int w=a.age;
        System.out.println("w = " + w);

        //mm
        User mm=new User();
        mm.name="苏苏";
        mm.age=18;
        mm.sex='♀';
        mm.age=mm.age+11;//先计算等式右边的值
        System.out.println("name = " + mm.name);

    }
}

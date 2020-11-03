package cn.edu.swfu;

//面向对象编程   java核心
public class User {
    public int age; //公有 所有都可用
    protected char sex; //受保护的
    String name;  //默认default
    private double money; //私有private

    public static void main(String[] args) {
          User u=new User();
          u.age=108;
          u.sex='♀';
          u.name="东方月初";
          u.money=99.99;
    }

}

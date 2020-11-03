package com.alibb;

public class ATest {

    public static void main(String[] args) {
        Student s=new Student();
        s.setUid(111);
        s.sleep();

        //转为父类对象 【向上造型，自动转换】
        UserInfo u=s;
        u.sleep();
        //父类转为子类对象 【向下造型，强制类型转换】
        Student s2= (Student) u;

    }


}

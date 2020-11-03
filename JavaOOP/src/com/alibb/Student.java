package com.alibb;

// 关键词 extends 继承
public class Student extends UserInfo {



    //重写：重写方法
    //重写注解  重写标记
    // ~返回值类型相同 参数列表相同~【重写不能降低权限】
    //this指向当前类  super父类
    @Override
    public void sleep(){
        super.sleep(); //调用父类方法
        System.out.println("no no no~~~no sleep~~");
    }


    private String className;
    private int score;

    public Student() {
    }

    public Student(int uid, String name) {
        super(uid, name);
    }

    public Student(String className, int score) {
        this.className = className;
        this.score = score;
    }

    public Student(int uid, String name, String className, int score) {
        super(uid, name);
        this.className = className;
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", score=" + score +
                '}';
    }
}

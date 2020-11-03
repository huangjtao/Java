package cn.edu.swfu;

public class Dog {
    private String name;
    private char sex;
    private String type;
    private int age;

    //显示信息的方法
    public void show(){
        String s="名字:"+name+"性别:"+sex+"种类:"+type+"年龄:"+age;
        System.out.println(s);
    }

    /**
     * get方法 用于获取属性的值
     * public 类型 get属性名首字母大写(){
     *     return 属性；
     * }
     */

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }


    /**
     * set方法 给属性赋值
     * 格式：
     * public void set 属性首字母大写(类型 变量名){
     *   this.属性名=变量名；
     * }
     */
    public void setAge(int a){
        age=a;
    }
    //this 指向自己
    public void setSex(char sex){
        this.sex=sex;
    }
    public void setName(String name){
        this.name=name;
    }

}

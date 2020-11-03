package cn.edu.swfu;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p = new Person("zhuzhu");

        Person obj = new Person(1, "zhuzhu", '♂', 999);

        System.out.println("obj = " + obj);//输出对象信息 默认自动调用toString
        System.out.println(obj.toString());

    }
}

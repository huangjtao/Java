package cn.edu.swfu;

public class CatTest {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.setAge(11);
        c.setName("xiaom");
        c.setSex('♀');
        c.setType("bsdiojg");

        c.getAge();
        c.getName();
        c.getSex();
        c.getType();

        System.out.println(c.toString());

    }
}

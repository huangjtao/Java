package cn.edu.swfu;

public class DogTest {

    public static void main(String[] args) {

        Dog d=new Dog();
        //d.age=11;
        d.setAge(11);
        d.setSex('♂');
        int w=d.getAge();
        System.out.println("w = " + w);
        //String 默认值null
        //int 默认值 0
        d.show();


    }
}

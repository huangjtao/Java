package cn.edu.swfu;

public class Person {
    /**
     * 构造函数(构造方法):用来创建对象直接调用
     * 格式：
     * public 类名(参数){
     * 代码
     * }
     */
    //无参和全参
    public Person(String username) {
        this.username = username;
    }

    public Person(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public Person(int id, String username, char sex, double money) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.money = money;
    }

    //无参构造函数【默认缺省构造函数就是无参】
    public Person() {
    }


    private int id;
    private String username;
    private char sex;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", money=" + money +
                '}';
    }
}

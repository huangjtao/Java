package util;

/**
 * 实体类   存放在 entity vo pojo  bean
 * 跟数据库中的表对应  字段类型对应
 */
public class Person {
    private int id;
    private String name;
    private String sex;
    //？？ 生成无参构造函数 全参构造函数 getset toString

    public Person() {
    }

    public Person(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

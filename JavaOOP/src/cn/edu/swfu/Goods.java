package cn.edu.swfu;

public class Goods {
    private String name;
    private double money;
    private String type;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public String getType(String s) {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

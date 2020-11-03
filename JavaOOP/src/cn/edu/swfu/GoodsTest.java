package cn.edu.swfu;

public class GoodsTest {
    public static void main(String[] args) {
        Goods g=new Goods();
        g.setMoney(100);
        g.setName("jiu");
        g.getType("sdfgvsdfg");

        System.out.println(g.toString());
    }


}

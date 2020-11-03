package cn.edu.swfu;

//方法学习~~~(函数)  method
public class Computer {

    //返回值类型 int
    public static int aaa(int a,int b){
        return a+b;
    }

    public static void demo(double a,int b){
        double s=a*b;
        System.out.println("s = " + s);
    }

    public static void sum(int a,int b){
        int w=a+b;
        System.out.println("w = " + w);
    }

    public static void total(int a,int b,int c){
        int w=a+b+c;
        System.out.println("w = " + w);
    }

     //没有返回值  void
    //public static 返回值类型 方法名(参数) {}

    public static void say() {
        System.out.println("方法名调用成功!!!");
    }
    //方法run "方法正在运行"  无返回值
    public static void run() {
        System.out.println("方法正在运行!!!");
    }

    //主函数 主方法
    public static void main(String[] args) {


    }
}

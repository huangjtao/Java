package cn.edu.swfu;

public class Pig {
    private int pid;
    private String name;
    private int kg;


    public Pig() {
    }

    public Pig(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public Pig(int pid, String name, int kg) {
        this.pid = pid;
        this.name = name;
        this.kg = kg;
    }


    @Override
    public String toString() {
        return "Pig{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", kg=" + kg +
                '}';
    }
}

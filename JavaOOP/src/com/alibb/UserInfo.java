package com.alibb;

//继承
public class UserInfo {

    public void sleep(){
        System.out.println("sleep asleep........");
    }



    private int uid;
    private String name;

    public UserInfo() {
    }

    public UserInfo(int uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                '}';
    }
}

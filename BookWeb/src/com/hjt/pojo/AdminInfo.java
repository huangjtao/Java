package com.hjt.pojo;

//和数据库表admininfo对应的java实体类
public class AdminInfo {
    private int id;
    private String username;
    private String password;
    private String picurl;

    //无参 全参 getset toString


    public AdminInfo() {
    }

    public AdminInfo(int id, String username, String password, String picurl) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.picurl = picurl;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    @Override
    public String toString() {
        return "AdminInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", picurl='" + picurl + '\'' +
                '}';
    }


}

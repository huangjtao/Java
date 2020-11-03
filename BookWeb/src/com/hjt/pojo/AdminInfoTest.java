package com.hjt.pojo;

import com.hjt.dao.AdminInfoDAO;
import com.hjt.dao.AdminInfoDAOImpl;

import java.util.List;

public class AdminInfoTest {

    public static void main(String[] args) {
        AdminInfo a=new AdminInfo(1,"admin","123456","ddd");

        AdminInfoDAO dao=new AdminInfoDAOImpl();
        List<AdminInfo> all = dao.getAll();
        System.out.println("all = " + all);
    }

}

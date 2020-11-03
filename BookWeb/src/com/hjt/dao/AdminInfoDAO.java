package com.hjt.dao;

import com.hjt.pojo.AdminInfo;

import java.util.List;

//interface 接口 定义了规范 没有任何具体代码实现
public interface AdminInfoDAO {

    public int save(AdminInfo a);//保存
    public int update(AdminInfo a);//修改
    public int delete(int id);//删除
    public List<AdminInfo> getAll();//查询所有
    public AdminInfo get(int id);//根据主键查询
    public List<AdminInfo> getPage(int pageNum,int pageSize);//分页查询


}

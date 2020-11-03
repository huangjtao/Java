package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 父包  com.baidu
 * 数据库操作类  一般写增删改查的代码 包名 dao
 * xxxxDAO
 */
public class PersonDAO {

    //分页查询

    /**
     * 文档注释
     * @param pageNum  页码
     * @param pageSize 每页显示条数
     * @return  查询结果
     */
    public  List<Person> getPage(int pageNum,int pageSize){
        List<Person> personList=new ArrayList<Person>();
        try {
            Connection conn=DBUtil.getConn();
            String sql="select * from person limit ?,? ";
            PreparedStatement pstm=conn.prepareStatement(sql);
            int start=(pageNum-1)*pageSize; //计算开始值
            pstm.setInt(1,start);
            pstm.setInt(2,pageSize);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String sex=rs.getString("sex");
                Person p=new Person(id,name,sex);//使用全参构造函数
                personList.add(p); //放入集合中
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  personList;
    }



    //查询数据库有多少条记录  count(*)
    public int getTotal(){
        int total=0;
        try {
            Connection conn=DBUtil.getConn();
            String sql="select count(*) as nums from person ";
            PreparedStatement pstm=conn.prepareStatement(sql);
            ResultSet rs=pstm.executeQuery();
            rs.next(); //永远只会有一条查询结果 可以这样做
            total=rs.getInt("nums");
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return total;
    }



    //根据姓名模糊查询
    public List<Person> getLike(String keyword){
        List<Person> personList=new ArrayList<Person>();
        try {
            Connection conn=DBUtil.getConn();
            String sql="select * from person where name like concat('%',?,'%')";
            PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.setString(1,keyword);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String sex=rs.getString("sex");
                Person p=new Person(id,name,sex);//使用全参构造函数
                personList.add(p); //放入集合中
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return personList;
    }




    //查询所有信息
    public List<Person> getAll(){
        List<Person> personList=new ArrayList<Person>();
        try {
            Connection conn=DBUtil.getConn();
            String sql="select * from person ";
            PreparedStatement pstm=conn.prepareStatement(sql);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String sex=rs.getString("sex");
                Person p=new Person(id,name,sex);//使用全参构造函数
                personList.add(p); //放入集合中
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  personList;
    }


    //查询单条记录 根据主键id查询
    public Person get(int id){
        Person p=null;
        try {
            Connection conn= DBUtil.getConn();
            String sql="select * from person where id=? ";
            PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.setInt(1,id);
            ResultSet rs=pstm.executeQuery(); //执行查询 获取返回结果集
            while(rs.next()){
                int pid=rs.getInt("id"); //获得id字段的值
                String name=rs.getString("name");//获得name字段的值
                String sex=rs.getString("sex");//获得sex字段的值
                p=new Person();
                p.setId(pid); //赋值给p对象
                p.setName(name);
                p.setSex(sex);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }




    public int delete(int id){
        int row=0;
        try {
            Connection conn=DBUtil.getConn();
            String sql=" delete from person where id=? ";
            PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.setInt(1, id );
            row=pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  row;
    }

    //修改 编辑
    public int update(Person p){
        int row=0;
        //自己写 ？？  新建UpdateTest进行测试 代码可复制
        try {
            Connection conn=DBUtil.getConn();
            String sql="update person set name=? ,sex=? where id=? ";
            PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.setString(1,p.getName());
            pstm.setString(2,p.getSex());
            pstm.setInt(3,p.getId());
            row=pstm.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  row;
    }



    //插入 增加
    public  int save(Person p){
        int row=0; //返回执行结果
        try {
            Connection conn=DBUtil.getConn(); //获取连接
            String sql=" insert into person(id,name,sex) values(?,?,?) "; //定义sql语句
            PreparedStatement pstm=conn.prepareStatement(sql); //预编译sql语句
            pstm.setInt(1,p.getId()); //绑定第一个参数
            pstm.setString(2,p.getName());//绑定第二个参数
            pstm.setString(3,p.getSex());//绑定第三个参数
            row=pstm.executeUpdate(); //获得执行结果
            pstm.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }


}

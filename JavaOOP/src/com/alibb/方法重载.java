package com.alibb;


/**
 * 方法重载
 * 1.方法名相同，参数列表不同（参数个数不同，or参数位置不同）
 * 2.返回值不同不构成方法重载
 *
 */
public class 方法重载 {

    public int sum(int a,int b){
        return a+b;
    }

    public int sum(int a,int b,int c){
        return a+b+c;

    }
    public int sum(char a,int b,int c){
        return a+b+c;
    }
    public int sum(int a,char b,int c){
        return a+b+c;
    }



}

package com.syntax.class15;

public class MethodDemo1 {
    void method1(){
        System.out.println(" i can use print statements in a void type method");
        int num=0;
        //When we use void we should not use the return keyboard because void means no data will be returned from this method

    }

    public static void main(String[] args) {
        MethodDemo1 methodDemo1=new MethodDemo1();
        // int x=methodDemo1.method1(); method with void return type can't be assigned to
        //variables

    }
}

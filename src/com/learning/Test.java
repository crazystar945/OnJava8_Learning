package com.learning;

import javax.xml.crypto.Data;
import java.util.Date;
public class Test {
    private Object data;
    private static Test t=null;
    private Test(Object data){
        this.data=data;
    }
    private Test(int i)
    {
        System.out.println("Create constructor"+i);
    }
    private  Test(){
        System.out.println("Create a single constructor");
    }
    public static Test access(int i){
        return new Test(i);
    }
    public void print(){
        System.out.println(data);
    }

    public static void main(String[] args) {
        Integer t=new Integer(100000000);
        String s=Integer.toBinaryString(t);
        System.out.println(s);
        String[] s3;
//
//        String s1="Hello World";
//        s3=s1.split(" ");
        s3=splitTest("Hello World"," ");

    }

    public static String[] splitTest(String begin,String b){
        String[] result=null;

        result=begin.split(b);
        return result;
    }
}

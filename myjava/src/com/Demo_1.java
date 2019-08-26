package com;

public class Demo_1 {
    int i=100;
    public void m1(int i)
    {
        this.i=i*10;
    }
    public void printNum()
    {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Demo_1 sc=new Demo_1();
        sc.m1(3);
        sc.printNum();
    }

}

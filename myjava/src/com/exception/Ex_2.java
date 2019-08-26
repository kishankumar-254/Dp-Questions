package com.exception;

public class Ex_2 {
    public static void main(String[] args) {
        System.out.println("this statement will exicute:");try {
            int i=100/0;
        }
        catch (ArithmeticException s)
        {


        System.out.println("this statement will also exicute:" );
    }
}}

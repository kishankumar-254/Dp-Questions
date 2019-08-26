package com.exception;

public class Ex_1 {
    public static void main(String[] args) {
        System.out.println("This statement will be exicuted:");
        try{
        Integer I = new Integer("abc");//This statement throws NumberFormatException
        }
        catch (NumberFormatException a)
        {
        System.out.println("This statement will also exicute");
    }
}}

package com;
import java.util.Scanner;
public class ReverseString_0 {
    public static void main(String[] args) {
        String s1="";
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String s2= sc.nextLine();
        for (int i=s2.length()-1;i>=0;i--)
        {
            s1=s1+s2.charAt(i);
        }
        System.out.println(s1);
    }

}

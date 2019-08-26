package com.exception;
import java.util.Scanner;
public class Pattern_1 {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            for (int j=a;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

package com.exception;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(fibonacci(i));
        }


    }

    public  static  int fibonacci(int i )
    {
        if(i==0)
        {
            return 0;
        }
        else if (i==1)
    {
        return 1;
    }
        else
        {
            return (fibonacci(i-1)+fibonacci(i-2));
        }
    }

    }


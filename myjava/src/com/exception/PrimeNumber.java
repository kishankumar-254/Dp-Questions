package com.exception;
import java.util.Scanner;
public class PrimeNumber  {
    public static void main(String[] args) {
        System.out.println("Enter range of number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=2;i<num;i++)
        {
            for (int j=1;j<num;j++)
            {
                if (i%j==0)
                {
                    System.out.println("prime number is: "+i);
                }
            }
        }
    }
}

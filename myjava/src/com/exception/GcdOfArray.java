package com.exception;
import java.util.Scanner;
public class GcdOfArray  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how much range you want to print array:");
        int n=sc.nextInt();
        int a[]=new int [n];
        for (int i=0;i<n;i++)
        {
            System.out.println("your "  + (i+1)+  " elements is:");
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("You have entered");
        for (int i=0;i<n;i++)
        {

            System.out.println(a[i]);
        }
        for (int i =0;i<a.length;i++)
        {
      for (int j=1;j<=a[i];j++)
                if (a[i]%j==0)
                {
                    System.out.println("factors is of" +a[i]+ "is:" +j);
                }
            }
        }
}

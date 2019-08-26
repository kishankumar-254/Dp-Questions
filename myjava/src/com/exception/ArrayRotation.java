package com.exception;
import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("how much range you want to print array:");
        int n=sc.nextInt();
        int a[]=new int [n];
        for (int i=0;i<n;i++)
        {
            System.out.println("your"  +(i+1)+  "elements is:");
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("You have entered");
        for (int i=0;i<n;i++)
        {

            System.out.println(a[i]);
        }
        System.out.println("Your rotated array is: ");
        temp=a[0];
        for(int i=1;i<n;i++)
        {
            a[i-1]=temp;
            a[n-1]=temp;
         }
        System.out.println(" results is:" +a[n-1]);

    }
}

package com.exception;
import java.util.Scanner;
public class DoublingTheValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number:");
        int N=sc.nextInt();
        System.out.println("Enter length of Array: ");
        int n=sc.nextInt();
        System.out.println("Your Array is start now:");
        int a[]=new int[n];
        for (int i=0;i<n;i++){

            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++)
            if (a[i]==N)
            {
                int temp=N*N;
                a[i]=temp;
                System.out.println("Your number:" + N + " is position at index " + (i)+ " Double value is " +temp);
            }

        System.out.println("The new array list Is:");
            for (int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
}}

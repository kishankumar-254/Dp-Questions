package com.exception;
import java.util.Scanner;
public class DuplicateArray {
    public static void main(String[] args) {
        System.out.println("Enter the range upto:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("you entering:");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("you have Entered:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("duplicate element is:");
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if ((a[i]==a[j])&&(i!=j))
                {
                    System.out.println(a[j]);
                }
            }
        }
    }
}

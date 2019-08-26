package com.exception;
import java.util.Scanner;
public class KadaneAlgo {
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
        int total=0;
        int element_sum=0;
        for(int i=0;i<a.length;i++)
        {
            element_sum=element_sum+a[i];
            if(total<element_sum)
            {
                total=element_sum;
            }
            if (element_sum<0)
            {
                element_sum=0;
            }
        }
        System.out.println("maximum subarray is:" +total);

    }
}

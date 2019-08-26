package com.exception;
import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("you are entering array elements:");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("you have entered");
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        int max=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]>arr[0])
            {
                max=arr[i];
                System.out.println(max);
            }
        }
    }
}

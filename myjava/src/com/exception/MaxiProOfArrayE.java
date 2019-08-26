package com.exception;
import java.util.Arrays;
import java.util.Scanner;
public class MaxiProOfArrayE {
    //Given an array with all elements greater than or equal to zero,
    // Return the maximum product of two numbers possible.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int number=sc.nextInt();
        int arr[]=new int[number];
        System.out.println("you are entering array elements:");
        for (int i=0;i<number;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("you have entered");
        for (int i=0;i<number;i++)
        {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int multi=arr[number-1]*arr[number-2];
        System.out.println(multi);
    }
}

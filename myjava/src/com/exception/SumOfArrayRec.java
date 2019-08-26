package com.exception;
import java.util.Scanner;
public class SumOfArrayRec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int M=sc.nextInt();
        int arr[]=new int[M];
        int N=arr.length;
        System.out.println("Enter the Array elements:");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //int arr[]={4,5,6,2,3};
        //int N=arr.length;
        System.out.println("sum of element of arrays is: "+sumOfArray(arr,N));

    }
    public static int sumOfArray(int []arr,int N)
    {
        if (N==0)
        {
            return 0;
        }
        else
        {
            return (sumOfArray(arr,N-1)+arr[N-1]);
        }
    }
}

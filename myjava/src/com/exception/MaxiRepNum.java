package com.exception;
import java.util.Scanner;
public class MaxiRepNum {
    /**Given an array A of size N, the array contains numbers in range from 0 to k-1
     where k is a positive integer and k <= N. Find the maximum repeating number in this array.
    If there are two or more maximum repeating numbers print the element having least value.
     */
    static  int count;
    static int maxRep;
    static int maxNum;
    static int j;
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int length=sc.nextInt();//taking input length of array from user.
        int arr[]=new int[length];// Declaring & initializing the array.
        System.out.println("Enter the elements:");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("you have entered: ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for (int i=0;i<arr.length;i++)
        {   count=1;
            for ( j=i+1;j<arr.length;j++)
            {
               if (arr[i]==arr[j])
               {
                   count++;
               }
            }
            if (count>maxRep )
            {
                maxRep=count;
                maxNum=arr[i];
            }
        }
        System.out.println("Maximum repeat number is: "+maxNum +" repeated "+ maxRep+ " times");

}}
package com.exception;
import java.util.Scanner;
public class MaxMinElements {
    //Given an array, find maximum and minimum elements from the array
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of arrays: ");
        int length= scanner.nextInt();
        int arr[]=new int[length];
        int max=0;
        int min=arr[0];
        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("you have entered arrays: ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-i;j++){

            if(arr[i]<=arr[j] && max <arr[j])
            {
                max = arr[j];
              }}

    }
    System.out.println("maximum elements is:" +max);
}}

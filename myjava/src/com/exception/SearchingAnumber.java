package com.exception;
import java.util.Scanner;
public class SearchingAnumber {
    public static void main(String[] args) {
        /*Given an array of N elements and a integer K.
         Your task is to return the position of first occurrence of K in the given array
        Note: Position of first element is considered as 1.**/
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number:");
        int number=scan.nextInt();
        System.out.println("Enter the length of array:");
        int len=scan.nextInt();
        int arr[]=new int[len];
        System.out.println("enter the elements:");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("you have entered:");
        for (int i=0;i<arr.length;i++)
        {
        System.out.println(arr[i]);
        }
          for(int i=0;i<arr.length;i++)
          {
              if (number==arr[i])
              {
                  System.out.println(" your entered number is " +arr[i]+" first occurred at " +(i+1) +" position");
                  break;
              }

          }
    }
}


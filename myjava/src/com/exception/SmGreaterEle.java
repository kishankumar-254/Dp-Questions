package com.exception;
import java.util.Scanner;
public class SmGreaterEle {
    public static void main (String[] args) {
        /*Given an array A of N length. We need to calculate
        the next greater element for each element in given array.
         If next greater element is not available in given
         array then we need to fill ‘_’ at that index place.
          */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Array elements:");
        for (int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the taste case:");
        int test = s.nextInt();
        while(test-->0)
        {
            for(int i=0;i<n;i++)
            {int num = Integer.MAX_VALUE;
                for(int j=0;j<n;j++)
                {
                    if(j==i)
                        continue;
                    if(a[j]<num&&a[j]>a[i])
                        num = a[j];
                }
                if(num==Integer.MAX_VALUE)
                    System.out.print("_ ");
                else
                    System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

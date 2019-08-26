package com.exception;
import java.util.Scanner;
public class TrangleInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of Array: ");
        int n=sc.nextInt();
        System.out.println("Your Array is start now:");
        int a[]=new int[n];
        for (int i=0;i<n;i++){

            a[i]=sc.nextInt();
        }
        System.out.println("You have entered:");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                for (int k=0;k<a.length;k++)
                {

                    if (a[i]*a[i]+a[j]*a[j]==a[k]*a[k])
                    {
                        System.out.println("Your Array triangle combination is: "+a[i]+" " +a[j]+ " " +a[k]);
                    }

                }
            }
        }
}
}

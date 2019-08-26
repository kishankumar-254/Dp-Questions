package com.exception;
import java.util.Scanner;
public class GcdInAraay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){

            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("You have entered: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);

        }

    }
}

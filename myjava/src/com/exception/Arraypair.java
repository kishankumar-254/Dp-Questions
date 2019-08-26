package com.exception;
import java.util.Scanner;
/*Given array & number if difference of any array
elements is equal to given number than print that pair element*/
public class Arraypair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int N=sc.nextInt();
        System.out.println("how much range you want to print array:");
        int n=sc.nextInt();
        int a[]=new int [n];
        for (int i=0;i<n;i++)
        {
            System.out.println("your "  +(i+1)+  " elements is:");
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("You have entered");
        for (int i=0;i<n;i++)
        {

            System.out.println(a[i]);
        }
        for (int i=0;i<a.length;i++)

        {
            for (int j=0;j<a.length;j++)
            {
                if (a[j]==a[i])
                {
                    continue;
                }
                int temp=a[j]-a[i];
                if (N==temp)
                {
                    System.out.println("The pair exit is:" +a[j]+" "+a[i]);
                }

            }
        }
    }
}

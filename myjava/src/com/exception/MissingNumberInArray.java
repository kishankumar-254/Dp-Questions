package com.exception;
import java.util.Scanner;
public class MissingNumberInArray {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("how much range you want to print array:");
        int n=sc.nextInt();
        int a[]=new int [n];
        for (int i=0;i<n;i++)
        {
            System.out.println("your"  +(i+1)+  "elements is:");
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("You have entered");
        for (int i=0;i<n;i++)
        {

            System.out.println(a[i]);
        }
        int expectNo=a.length+1;

        System.out.println("expected length of Array:"+expectNo);

        int totalNo=(expectNo*(expectNo+1))/2;

        System.out.println("expected sum of Array:" +totalNo);
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("total sum of given Array:"+sum);

int misNo=totalNo-sum;

        System.out.println("missing number in array is:" +misNo);


    }

}

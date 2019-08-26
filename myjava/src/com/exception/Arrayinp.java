package com.exception;
import java.util.Scanner;
public class Arrayinp {
    public static void main(String[] args) {
        int temp=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("how money elements you wants to enter:");
        int n=sc.nextInt();// how many elements want to print:
        int a[]=new int[n];
        //declaring and initilizing  Array:
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the"   +(i+1)+   "elements");
            a[i]=sc.nextInt();
        }
sc.close();
        System.out.println("you have entered number is_");
        for (int i=0;i<n;i++)
        {
            System.out.print(" " +a[i]);
        }

for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        if(a[j]>a[j-1])
        {
           temp=a[j-1];
           a[j]=a[j-1];
           a[j]=temp;
        }
        System.out.println("Sorted Array are_" +a[j]);
    }
}

sc.close();
    }
}

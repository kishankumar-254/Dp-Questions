package com;
import java.util.Scanner;
public class Check_1 {
    public static void main(String[] args) {
        int sum=0,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int a =sc.nextInt();
        for(i=1;i<=a;i++)
        {
            for( j=1;j<i;j++)
            {
            if(i%j==0)
            {
                sum=sum+i;
            }


        }}
        if(sum==a)
        {
            System.out.println(i);
        }

    }


}

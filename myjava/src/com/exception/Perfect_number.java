package com.exception;
import java.util.Scanner;
public class Perfect_number {
    public static void main(String[] args) {
        long sum,b;
        System.out.println("Enter any number");
        Scanner sc= new Scanner(System.in);
        long n=sc.nextInt();
        for( b=1;b<=n;b++)
        {
            sum=0;
            for(long j=1;j<b;j++)
            {
                if(b%j==0)
                {
                   sum=sum+j;
                }
            }
            if(b==sum)
            {
                System.out.println(b);
            }
        }

    }
}

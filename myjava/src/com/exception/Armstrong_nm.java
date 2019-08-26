package com.exception;
import java.util.Scanner;
public class Armstrong_nm
{
    public static void main(String[] args) {

         int r,c,x;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            int sum=0;
            x=a;
        while (x>0)
        {
            r=x%10;
            c=r*r*r;
            sum=sum+c;
            x=x/10;
        }
        if(sum==a){
            System.out.println(a);
    }

}}}

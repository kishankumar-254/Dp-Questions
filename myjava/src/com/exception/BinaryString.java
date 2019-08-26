package com.exception;
import java.util.Scanner;
public class BinaryString {
    /* Given a binary string, count number of substrings that start and end with 1.
    For example, if the input string is “00100101”,
     then there are three substrings “1001”, “100101” and “101”.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String: ");
            String str=sc.nextLine();
            char[] ch=str.toCharArray();
            int count=0;

            for (int i=0;i<ch.length;i++)
            {
                if (ch[i]=='1')
                {
                    count++;

                }
            }
            int m=count*(count-1)/2;
            System.out.print("There are no. of substrings is " +m);
            System.out.println();


    }
}

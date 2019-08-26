package com;
import java.util.Scanner;
public class String_1 {
    public static void main(String[] args) {
        String reverse ="";
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        String original=sc.nextLine();
        for (int i=original.length()-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        if (original.equals(reverse))
        {
            System.out.println("Entered String is palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}

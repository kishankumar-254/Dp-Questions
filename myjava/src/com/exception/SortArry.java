package com.exception;
import java.util.Scanner;
public class SortArry {

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        //taking input from user
        int[] a = new int[n];// declaring and initilizing Array
        for ( i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }

    }}
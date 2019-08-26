package interview;

import java.util.Scanner;

public class FirstQ {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println(" enter the number");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

    }
}

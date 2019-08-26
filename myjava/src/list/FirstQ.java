package list;
import hp.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class FirstQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Third third = new Third();
        System.out.println("Enter the length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }
    public static void printSubset(int arr[]){

    }
    public void subSet(int[] arr,boolean []print,int start,int end){

        if (end==0){
            for(int i=0;i<print.length;i++){
                if(print[i]){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.print("}\n");
        }
        else{
            if(start+end>arr.length)
            for (int i=start;i<arr.length;i++){

            }
        }

    }

}


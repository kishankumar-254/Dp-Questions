package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSumSubSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxSubSequence(arr);
    }
    public static void maxSubSequence(int arr[]){
        int max[]=new int[arr.length];
        ArrayList<Integer> list=null;
        for(int i=0;i<max.length;i++){
            max[i]=arr[i];
        }

        for (int i=1;i<arr.length;i++){
            list=new ArrayList<>();
            for (int j=0;j<i;j++){
                if(arr[j]<arr[i] && max[i]<max[j]+arr[i]){
                    max[i]=max[j]+arr[i];
                    list.add(arr[i]);

                }
            }
        }
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<max.length;i++){
            if(maxSum<max[i]){
                maxSum=max[i];
            }
        }
        System.out.println(maxSum);
        for(int x:list){
            System.out.print(x+" ");
        }

    }
}

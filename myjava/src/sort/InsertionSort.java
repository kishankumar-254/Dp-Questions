package sort;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=1;i<n;i++){
            int val=arr[i];
            int tmp=i;
            while(tmp>0 && arr[tmp-1]>val){
                arr[tmp]=arr[tmp-1];
                tmp--;
            }
            arr[tmp]=val;
        }
        System.out.println("sorted form");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

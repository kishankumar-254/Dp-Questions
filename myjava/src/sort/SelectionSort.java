package sort;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int tmp=arr[i];
            arr[i]= arr[min];
            arr[min]=tmp;
        }
        System.out.println("sorted form");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

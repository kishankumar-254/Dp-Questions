package sort;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;

                }
            }
        }
        System.out.println("Sorted form:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }


    }
}

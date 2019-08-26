package search;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinearSearch search=new LinearSearch();
        System.out.println("Enter the length:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        search.search(arr,9);

    }
    public void search(int arr[],int data){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==data){
                System.out.print("Elements is exit : " +arr[i]);
                break;
            }
        }
    }
}

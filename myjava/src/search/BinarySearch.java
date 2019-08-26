package search;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinarySearch search=new BinarySearch();
        System.out.println("Enter the length:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int nm=search.binarySearch(arr,5,true);
        if(nm==-1){
            System.out.println("data is not present");
        }
        else {
            int nm1=search.binarySearch(arr,5,false);
            System.out.println("count " + (nm1-nm+1));
        }
    }
    public int binarySearch(int arr[],int data,boolean flag) {
        int first = 0;
        int last = arr.length-1;
        int result=-1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == data) {
                result=mid;
                if(flag) {
                    last = mid - 1;
                }
                else{
                    first=mid+1;
                }
            } else if (data < arr[mid]) {
                last=mid-1;

            }
            else {
                first=mid+1;
            }
        }
        return result;
    }
}

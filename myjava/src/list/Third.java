package list;
import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        /*for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }*/
        combination(arr,9);

    }
    public static void combination(int arr[],int nmr){

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int l=i;
            int h=i+1;
            int end=arr.length-1;
            while(l<=end) {

                    if (arr[l] + arr[h] + arr[end] == nmr) {
                        if(arr[l]!=arr[h] && arr[l]!=arr[end]&& arr[h]!=arr[end]) {
                            list.add(arr[l]);
                            list.add(arr[h]);
                            list.add(arr[end]);
                        }
                        l++;

                    } else if (arr[l] + arr[h] + arr[end] > nmr) {

                        end--;
                    } else {
                        l++;
                    }
                }

            for (int x: list){
                System.out.println(x+" ");
            }

        }
    }
}

package dp;
import hp.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two String");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        subString(s1,s2);

    }
    public static void subString(String str1,String str2){
        int max=0;
        int l1=str1.length();
        int l2=str2.length();
        int arr[][]=new int[l1+1][l2+1];
        ArrayList<String> list=null;
        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                    if(arr[i][j]>max){
                        max=arr[i][j];
                        list=new ArrayList<>();
                        list.add(str2.substring(i-max,i));
                    }
                }
            }
        }
        System.out.println(max);
        for(String x:list){
            System.out.print(x+" ");
        }
    }
}

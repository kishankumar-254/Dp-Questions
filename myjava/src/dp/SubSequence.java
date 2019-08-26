package dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SubSequence {
	// this is a test change
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two stirng");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        subSequence(s1,s2);
    }
    public static void subSequence(String str1,String str2){
        int n1=str1.length();
        int n2=str2.length();
        HashSet<Character> list=new LinkedHashSet<>();
        int[][]arr=new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                if(i==0 || j==0){
                    arr[i][j]=0;
                }
                else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                    list.add(str1.charAt(i-1));
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        System.out.println(arr[n1][n2]);
        for (char x:list) {
            System.out.print(x);
        }

    }
}

package list;

import java.util.List;
import java.util.Scanner;

public class FourthQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        int n=countSubstrings(s);
        System.out.println(n);
    }
    public static int countSubstrings(String s) {
        char [] sChar = s.toCharArray();

        int ans = 0;


        int mid = 1;
        while(mid < sChar.length){
            int left = mid - 1;
            int right = mid;
            while(sChar[left] == sChar[right]){
                System.out.println(sChar[left]);

                ans ++;
                left --;
                right ++;
                if (left < 0 || right == sChar.length)
                    break;
            }
            mid ++;
        }


        mid = 0;
        while(mid < sChar.length){
            ans ++;
            System.out.println(sChar[mid]);
            int left = mid - 1;
            int right = mid + 1;
            while(left >= 0 && right < sChar.length && sChar[left] == sChar[right]){
                ans ++;
                System.out.println(sChar[left]);

                left --;
                right ++;
            }
            mid ++;
        }
        return ans;
    }
}








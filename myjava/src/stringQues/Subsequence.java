package stringQues;
import java.util.Scanner;
public class Subsequence {
    //Given two strings A and B, find if A is a subSequence of B
    public static void main(String[] args) {
        String stFinal="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str=sc.nextLine();
        System.out.println("Enter the second String:");
        String stn=sc.nextLine();

        char [] str1=str.toCharArray();
        char[]str2=stn.toCharArray();
        for (int i=0;i<str1.length;i++)
        {for (int j=0;j<str2.length;j++)
        {
         if (str1[i]==str2[j])
         {
             stFinal=stFinal+str1[i];
         }
        }

        }
        System.out.println(stFinal);
        System.out.println();
    }
}

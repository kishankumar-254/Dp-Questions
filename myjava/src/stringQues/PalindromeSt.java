package stringQues;
import java.util.Scanner;
import java.lang.*;
public class PalindromeSt {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        String rev="";
        for (int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("reverse String is: " +rev);
        if(s.equals(rev))
        {
            System.out.println("yes it is palindrome");
        }
        else
        {
            System.out.println("not a palindrome string");
        }
    }
}



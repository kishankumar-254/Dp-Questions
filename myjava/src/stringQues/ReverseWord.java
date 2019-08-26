package stringQues;
import java.util.Scanner;
public class ReverseWord {
    static  void reverseWord(String stg)
    {
        String rev="";
        String[] str=stg.split(" ");
        for (int i=str.length;i>=0;i--)
        {
            rev=rev+stg.charAt(i);
        }
        System.out.println(rev);

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any sentence:");
        String s=sc.nextLine();
        reverseWord(s);
    }
}

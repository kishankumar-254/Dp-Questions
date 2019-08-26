package stringQues;
import java.util.Arrays;
import java.util.Scanner;
public class CheckAnagram {
    public static boolean checkAnagram(String str,String sts)
    { if ( str.length() !=sts.length())
    {
        return false;
    }
    String sm=str.toUpperCase();
    String sn=sts.toUpperCase();
    char [] ss=sm.toCharArray();
        Arrays.sort(ss);
    char[]sd=sn.toCharArray();
    Arrays.sort(sd);
        return Arrays.equals(ss,sd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two string:");
        String s=sc.nextLine();
        String st=sc.nextLine();
        System.out.println(checkAnagram(s,st));
    }
}

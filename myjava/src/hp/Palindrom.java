package hp;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        int sum=0,n =454,r,temp=n;

        while (n>0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        n=temp;
        if (n==sum)
        {
            System.out.println("Entered number is palindrome:");
        }
        else
        {
            System.out.println("Not palindrom:");
        }
    }
}

package hp;
import java.util.Scanner;
public class OctalToDecimal {
    public static void main(String[] args) {
        int rem,i=1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int a=sc.nextInt();
        while (a>0)
        {
            rem=a%8;
            a=a/8;
            sum=sum+(rem*i);
            i=i*10;
        }
        System.out.println("Decimal to Octal number is:" +sum);
    }
}

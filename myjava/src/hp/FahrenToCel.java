package hp;
import java.util.Scanner;
public class FahrenToCel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temp in Fahrenheit:");
        int f=sc.nextInt();
        int c=((f-32)/9)*5;
        System.out.println("Fahrenheit to Celsius degree:" +c);

    }
}

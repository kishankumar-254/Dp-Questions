package hp;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int temp;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a=d.nextInt();
        System.out.println("Enter value of b:");
        int b=d.nextInt();
        temp =a;
        a=b;
        b=temp;
        System.out.println("Value of a:" +a);
        System.out.println("Value of b:" +b);


    }
}

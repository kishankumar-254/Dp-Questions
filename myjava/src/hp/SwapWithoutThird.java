package hp;
import java.util.Scanner;
public class SwapWithoutThird {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a=c.nextInt();
        System.out.println("Enter value of b:");
        int b=c.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a:" +a);
        System.out.println("Value of b:" +b);
    }

}

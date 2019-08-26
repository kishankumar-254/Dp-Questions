package hp;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        int x=1,y=1;
        System.out.println("Enter any Number:");
        Scanner a=new Scanner(System.in);
        int d=a.nextInt();

        for (int i=1;i<=d;i++)
        {
            System.out.println(x);
            int z=x+y;
            x=y;
            y=z;



        }
    }
}

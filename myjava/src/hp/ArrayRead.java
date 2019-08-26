package hp;
import java.util.Scanner;
public class ArrayRead {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter an Array");
        int b[]=new int[5];
        for (int i=0;i<=5;i++)
        {
            b[i]=a.nextInt();
        }
        System.out.println("Array element are:");
        for (int i=0;i<=5;i++)
        {
            System.out.println(" " +b[i]);
        }
    }
}

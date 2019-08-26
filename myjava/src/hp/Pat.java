package hp;
import java.util.Scanner;
public class Pat {
    public static void main(String args[]){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter value of num");
        int num = k.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>=i;i--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }



}}

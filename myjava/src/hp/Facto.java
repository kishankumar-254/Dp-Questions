package hp;
import java.util.Scanner;
public class Facto {
    public static void main(String[] args) {
    int fact=1;
    Scanner d=new Scanner(System.in);
        System.out.println("Enter value of a:");
    int a=d.nextInt();
    for(int i=a;i>0;i--)
    {
        fact=fact*i;
    }
        System.out.println("fact:" +fact);
}}

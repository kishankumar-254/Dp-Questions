package hp;

public class ExceptionHand {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(10/5);
        }

    }
}

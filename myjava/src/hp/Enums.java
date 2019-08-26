package hp;

public class Enums {
    public static void main(String[] args) {
        Beer b=Beer.KF;
        System.out.println("HELLO");
    }
}
enum Beer
{
    KF,KO,RF,RC;
    Beer()
    {
        System.out.println("constructor...");
    }

}

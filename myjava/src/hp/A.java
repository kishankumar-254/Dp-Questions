package hp;

public class A {
        int i = 10;
        public void printValue(){
            System.out.print("Value-A");
        }
    }

    class B extends A{
        int i = 12;
        public void printValue()
        {
            System.out.print("Value-B");
        }
    }


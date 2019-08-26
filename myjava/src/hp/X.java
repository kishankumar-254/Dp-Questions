package hp;

import javax.sound.midi.SysexMessage;

public class X  {
    public X()
    {
        System.out.println(1);
    }


}

class Y extends X
{

    public Y(int i)
    {
        super();
        System.out.println(2);
    }
}
package stringQues;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class DuplicateWord {
    static void duplicateWord(String st)
    {
        String[] str=st.split(" ");
        System.out.println(str);
        HashMap<String,Integer> hm=new HashMap<>();
        for (String stn:str) {
            if (hm.get(stn) != null) {
                hm.put(stn, hm.get(stn) + 1);
            } else {
                hm.put(stn, 1);
            }
        }
        Iterator<String> stn=hm.keySet().iterator();
        while (stn.hasNext())
        {
        String temp=stn.next();
        if (hm.get(temp)>1)
        {
            System.out.println("the duplicate word is "+temp+ " appear " +hm.get(temp)+ "  times");
        }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter any sentence:");
        Scanner sc= new Scanner(System.in);
        String ss=sc.nextLine();

        duplicateWord(ss);
    }

}

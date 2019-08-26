package stringQues;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
public class DuplicateChar {
    static void duplicateWord(String str)
    {
        HashMap<Character,Integer> hM=new HashMap<>();
        char[] st=str.toCharArray();
        for (char s:st)
        {
            if (hM.get(s)!=null)
            {
                hM.put(s,hM.get(s)+1);
            }
            else
            {
                hM.put(s,1);
            }
        }
        Iterator<Character> chm =hM.keySet().iterator();
        while (chm.hasNext())
        {
            char temp=chm.next();
            if (hM.get(temp)>1)
            {
                System.out.println("Duplicate character is: " +temp);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Sting word:");
        String sts=sc.nextLine();
        duplicateWord(sts);
    }
}

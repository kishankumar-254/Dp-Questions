package com.linklist;
import java.util.*;
import java .util.Stack;
public class CheckParentheses {
    int top=-1;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String string=scanner.nextLine();
        int length=string.length();
        CheckParentheses check =new CheckParentheses();
        Stack characterStack=new Stack<>();
        for (int i=0;i<length;i++){
            if (string.charAt(i)=='{'||string.charAt(i)=='['||string.charAt(i)=='('){
                characterStack.push(string.charAt(i));
            }

        else if ( !string.isEmpty() && ((string.charAt(i) == ']' && characterStack.peek() == "[") ||
                (string.charAt(i) == '}' && characterStack.peek() == "{") ||
                (string.charAt(i) == ')' && characterStack.peek() == "("))) {

            characterStack.pop();

        }  else {
            characterStack.push(string.charAt(i));
        }
    }

         if(characterStack.empty()) {
        System.out.println("Balanced");
    } else {
        System.out.println("Not balanced");
    }

}



}

package com.linklist;
import java.util.Scanner;
public class StackParentheses {
    int top=-1;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StackParentheses st=new StackParentheses();
        System.out.println("Enter Any String");
        String string=scanner.nextLine();
        char [] Stack=new char[string.length()];
        st.push(Stack,string);
        st.pop(Stack,string);

        }

    public void push(char[] Stack,String string){
        if (top==Stack.length-1){
            System.out.println("Stack is overflow");
        }
        else
        {
              for (int i=0;i<string.length();i++){
                if (string.charAt(i)=='['||string.charAt(i)=='{'||string.charAt(i)=='(')
                {
                    top++;
                    Stack[top]=string.charAt(i);

                }

        }
            System.out.println(Stack);
    }}
    public void pop(char[] Stack,String string){
        if (top==-1){
            System.out.println("Stack is underflow");
        }
        else {
            for (int i=0;i<Stack.length;i++)
            if (string.charAt(i)=='}' && Stack[top]=='{') {
                  top--;
            }
            else if (string.charAt(i)==']'&&Stack[top]=='['){
                    top--;
            }
            else if (string.charAt(i)==')'&&Stack[top]=='(')
            {
                top--;
            }
        }
        System.out.println(Stack);
        if (top==-1){
            System.out.println("String is balanced");
        }
        else {
            System.out.println("String is unbalance");
        }
    }
}


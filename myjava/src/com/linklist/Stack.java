package com.linklist;
import java.util.Scanner;
public class Stack {
    int top=-1;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack stk=new Stack();
        char []crr={'(','(','a','+','b',')',')','[',']','}'};
        char stack []=new char[crr.length];
        stk.top=-1;
        stk.check(crr,crr.length,stack);

    }
    public void check(char[] str,int n,char[] stack)
    {
        for (int i=0;i<n;i++){
            if (str[i]=='(' || str[i] == '{' || str[i] == '['){
                top=top+1;
                if(top < 0) {
                    System.out.println("Unbalanced Input ");
                    break;
                }
                stack[top]=str[i];

            }
            if(top >= 0) {
                if (str[i] == ')' && stack[top] == '(') {
                    top = top - 1;
                } else if (str[i] == '}' && stack[top] == '{') {
                    top--;
                } else if (str[i] == ']' && stack[top] == '[') {
                    top -= 1;
                }
            }

        }
        System.out.println(this.top);
        /*for (int i=0;i<n;i++)
        {
            if (str[i]==')' && stack[top]=='('){
                top=top-1;
            }else if(str[i] == '}' && stack[top] == '{'){
                top--;
            }else if(str[i] == ']' && stack[top] == '['){
                top-=1;
            }
        }
        System.out.println(this.top);*/
        if (this.top==-1){
            System.out.println("String is balance");
        }
        else{
            System.out.println("String is Unbalance");
        }

    }
    }
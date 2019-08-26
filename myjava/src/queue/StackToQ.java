package queue;

import java.util.Stack;

public class StackToQ {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public static void main(String[] args) {
        StackToQ q=new StackToQ();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(5);
        q.deQueue();
        q.enQueue(6);
        q.deQueue();
        q.enQueue(8);
        q.deQueue();
        q.deQueue();
        q.deQueue();



    }
    public void enQueue(int data){
        stack1.push(data);

    }
   public  void deQueue() {
        if(stack2.isEmpty()) {
            if (!stack1.isEmpty()) {
                while (!stack1.isEmpty()) {
                    int tmp = stack1.pop();
                    stack2.push(tmp);
                }
            }
        }
        System.out.println(stack2.pop());
    }
}

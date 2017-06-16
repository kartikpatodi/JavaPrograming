/**
 * Created by Kartik Patodi on 12-03-2017.
 **/

import java.text.DecimalFormat;
import java.util.*;

class MyQueue<T>{
    Stack<T> stack = new Stack<>();
    Stack<T> queue = new Stack<>();


    void enqueue(T val)
    {
        stack.push(val);
    }

    void dequeue()
    {
        if(queue.isEmpty()){
            while(!stack.isEmpty()){
                queue.push(stack.pop());
            }
        }
        queue.pop();
    }

    T peek(){
        if(queue.isEmpty()){
            while(!stack.isEmpty()){
                queue.push(stack.pop());
            }
        }
        return queue.peek();
    }

}

public class Test
{
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        DecimalFormat format = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

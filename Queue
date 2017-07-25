import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Queue {
    public class MyQueue<T>{
        Stack<T> queue = new Stack<T>();

        public void enqueue(T val){
            queue.add(val);
        }

        public T dequeue(){
            T temp = queue.get(0);
            queue.remove(0);
            return temp;
        }   

        public T peek(){
            T temp = queue.get(0);
            return temp;
        }
       
    }
   
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
       
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

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StackChar {
    
    public static boolean isBalanced(String expression) {
        if (expression.length() == 0) return false;
        Stack<Character> stack = new Stack<>();
        char[] expChar = expression.toCharArray();
        for(char brack : expChar){
           switch(brack){
               case '{': stack.push('}'); break;
               case '[': stack.push(']'); break;            
               case '(': stack.push(')'); break;            
               default: 
                   if (stack.empty() || brack != stack.pop())
                       return false;
           }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

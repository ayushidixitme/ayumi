package StackandQueue;
import java.util.*;
public class isBalanced {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(isBalanced(s));

    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);

            if (cc == '{' || cc == '[' || cc == '(') {
                stack.push(cc);
            } else if (cc == '}' || cc == ']' || cc == ')') {
                if(stack.isEmpty()) {
                    return false;
                }

                char top=stack.peek();
                if(cc=='}') {
                    if(top=='{') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }

                if(cc==']') {
                    if(top=='[') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }

                if(cc==')') {
                    if(top=='(') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            } else {
                // do nothing
            }
        }

        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

}

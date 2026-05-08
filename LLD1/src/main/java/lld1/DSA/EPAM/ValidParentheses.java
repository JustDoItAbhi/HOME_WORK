package lld1.DSA.EPAM;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses {
    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
     */
    public static boolean isValid(String s){
        int n=s.length();
        char[]ch=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=s.charAt(i);
        }
        Deque<Character> deque=new ArrayDeque<>();
        for(char c:ch){
            if(c=='('){
                deque.push(')');
            }else if (c=='['){
                deque.push(']');
            }else if (c=='{'){
                deque.push('}');
            }else{
                if(deque.isEmpty()|| deque.pop()!=c){
                    return false;
                }
            }
        }

    return deque.isEmpty();
    }
    public static void main(String[] args) {
        String s="()";
        System.out.println(" ans1  "+isValid(s));
        String a="()[]{}";
        System.out.println(" ans2  "+isValid(a));
        String b="(]";
        System.out.println(" ans3  "+isValid(b));
        String c= "([])";
        System.out.println(" ans4  "+isValid(c));
        String d= "([)]";
        System.out.println(" ans5  "+isValid(d));

    }
}

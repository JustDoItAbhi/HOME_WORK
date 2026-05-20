package lld1.DSA.strings.leetcode_string;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ValidPrantheses {

    public static boolean solve(String str){
        while (true){
            if (str.contains("()")) {
                str=str.replace("()","");
            } else if (str.contains("{}") ){
                str=str.replace("{}","");

            } else if (str.contains("[]")) {
                str=str.replace("[]","");
            }
            else {
                    return str.isEmpty();
            }
        }
    }
    public static void main(String[] args) {
        String x="()";
        System.out.println(solve(x));
        String y = "()[]{}";
        System.out.println(solve(y));
        String a = "(]";
        System.out.println(solve(a));
        String b = "([])";
        System.out.println(solve(b));
        String c = "([)]";
        solve(c);
        System.out.println(solve(c));
    }
}

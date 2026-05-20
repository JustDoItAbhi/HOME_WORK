package lld1.DSA.strings.leetcode_string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String solve(String[] str) {
        int n=str.length;
        Arrays.sort(str);
        StringBuilder sb=new StringBuilder();

        String prifix=str[0];
        String prifix1=str[n-1];
        int minLength=Math.min(prifix1.length(),prifix.length());
        int i=0;
        while (i<minLength && prifix.charAt(i)==prifix1.charAt(i)){
            i++;
        }

        return prifix.substring(0,i);
    }
    public static void main(String[] args) {
      String[]  strs = {"flower","flow","flight"};//fl
        System.out.println("ANS 1: "+solve(strs));


       String [] str = {"dog","racecar","car"};// ""
        System.out.println("ANS 2: "+solve(str));
        String []x={"aaa","aa","aaa"};
        System.out.println(solve(x));

    }
}

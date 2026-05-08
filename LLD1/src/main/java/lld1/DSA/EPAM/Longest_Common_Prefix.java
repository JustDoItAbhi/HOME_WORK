package lld1.DSA.EPAM;

import java.util.Arrays;
import java.util.HashMap;

public class Longest_Common_Prefix {
    /*
    Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
     */
    public static String solve(String []s){

        Arrays.sort(s);
        String first=s[0];
        String last=s[s.length-1];
        int i=0;
        while (i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
//        Output: "fl"
        System.out.println(solve(strs));
        System.out.println();
        String [] strs1 = {"dog","racecar","car"};
//        Output: ""
//        Explanation: There is no common prefix among the input strings.
        System.out.println(solve(strs1));

    }
}

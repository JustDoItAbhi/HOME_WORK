package lld1.DSA.EPAM;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class FirstUniqueCharacterInAString {
    public static int solve(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)) {
                map.put(ch,1);
            }else {
                int temp = map.get(ch);
                temp++;
                map.put(ch, temp);
            }
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                return i;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        String s= "leetcode";//        Output: 0
//        Explanation: 'l' is first unique character
        System.out.println(solve(s));
        // put all the array in hashmap , check all unique lettters , then check with i value of that unique letter add that i value to queue and get frist letter

        String x= "loveleetcode";//        Output: 2
//        Explanation: 'v' is first unique character
        System.out.println(solve(x));
        String y= "aabb";//        Output: -1
//        Explanation: no unique character
        System.out.println(solve(y));
    }
}

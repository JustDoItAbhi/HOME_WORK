package lld1.DSA.EPAM;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Valid_Anagram {
    public static boolean solve(String a , String b){
        int n=a.length();
        int m=b.length();
        if(n!=m ){
            return false;
        }
        char[]count=new char[26];
     for(int i=0;i<n;i++){
         count[a.charAt(i)-'a']++;
         count[b.charAt(i)-'a']--;
     }
     for(int c:count){
         if(c!=0){
             return false;
         }
     }
     return true;
    }
    public static void main(String[] args) {
     String s = "anagram", t = "nagaram";  //Output: true

        System.out.println(solve(s,t));

       String   a = "rat", b = "car";// Output: false
        System.out.println(solve(a,b));


        String   x = "ggii", y = "eekk";// Output: false
        System.out.println(solve(x,y));

    }


}

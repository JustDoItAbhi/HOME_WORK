package lld1.DSA.strings.leetcode_string;

import lombok.val;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public static boolean solve(String a , String b){
        char [] ch=a.toCharArray();
        String[] sh=b.split(" ");
      if(a.length()!=sh.length) {
          return false;
      }
        for(int i=0;i<a.length();i++){
        for(int j=i+1;j<a.length();j++){
            if(ch[i]==ch[j]){
                if(!sh[i].equals(sh[j])){
                    return false;
                }
            }else {
                if(sh[i].equals(sh[j])){
                    return false;
                }
            }
            }
        }

        return true;
    }
    public static boolean optimized(String a, String b){
        char[]ch=a.toCharArray();
        String[]sh=b.split(" ");
        int n=ch.length;
        if(n!=sh.length){
            return false;
        }

        HashMap<Character,String>map=new HashMap<>();
        for(int i=0;i<n;i++){
            boolean contains=map.containsKey(ch[i]);
            if(map.containsValue(sh[i])&& !contains){
                return false;
            }
            if(contains && !map.get(ch[i]).equals(sh[i])){
                return false;
            }else{
                map.put(ch[i],sh[i]);
            }
        }
        return true;
    }


    public static void main(String[] args) {
//        String pattern = "abba"; String s = "dog cat cat dog";// true
//        System.out.println("ANS 1 : "+ solve(pattern,s));
//        String pattern1 = "abba"; String r = "dog cat cat fish";//false
//        System.out.println("ANS 2 : "+ solve(pattern1,r));
//        String pattern2 = "aaaa"; String t = "dog cat cat dog";//false
//        System.out.println("ANS 3 : "+ solve(pattern2,t));
        System.out.println("--------------------------------------------------------------");
        String x = "abba"; String a = "dog cat cat dog";// true
        System.out.println("ANS 1 : "+ optimized(x,a));
        String y = "abba"; String b = "dog cat cat fish";//false
        System.out.println("ANS 2 : "+ optimized(y,b));
        String z = "aaaa"; String c = "dog cat cat dog";//false
        System.out.println("ANS 3 : "+ optimized(z,c));

        // if a==dog and b==cat return true, of if a or b == fish retunr false
    }
}
/*
HashMap<Character,String>map=new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            boolean containsKey= map.containsKey(ch);
            if(map.containsValue(sh)&& !containsKey){
                return false;
            }
            if(containsKey && !map.get(ch).equals(sh[i])){
                return false;
            }
            else{
                map.put(ch,sh[i]);
            }
        }
 */
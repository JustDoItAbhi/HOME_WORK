package lld1.DSA.strings.task;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean solve(String a, String b){
        int n=a.length(); int m=b.length();
        if(n!=m){
            return false;
        }
        int[]visited=new int[256];
        for(int i=0;i<n;i++){
            char ch=a.charAt(i);
            char sh=b.charAt(i);
            visited[ch]++;
            visited[sh]--;
        }
        int sum=0;
        for(int i=0;i<visited.length;i++){
           if(visited[i]!=0){
              return false;
           }
        }
        return true;
    }
    public static boolean anotherTry(String a, String b){
        int n=a.length(); int m=b.length();
        if(n!=m){
            return false;
        }


        for(int i=0;i<n;i++){

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(solve("listen","silent"));
        System.out.println(solve("cat","rat"));//f
        System.out.println(solve("aabbcc" , "abcabc"));//t
//        System.out.println("ANOTHER ");
//        System.out.println(anotherTry("listen","silent"));
//        System.out.println(anotherTry("cat","rat"));//f
//        System.out.println(anotherTry("aabbcc" , "abcabc"));//t
        // first add then into boolean array , mark them true on all values of char,
        //
    }
}

package lld1.DSA.strings.leetcode_string;

import java.util.HashMap;

public class FindTheDifference {
    public static void solve(String  a , String b){
        int n=a.length(); int m=b.length();

        char[]ch=a.toCharArray();
        char[]sh=b.toCharArray();
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=Character.valueOf (sh[i]);
        }
        for(int i=0;i<n;i++){
             sum-=Character.valueOf (ch[i]);
        }

//      sum-=sum;
        System.out.println("ANS "+(char)sum);

    }

    public static void main(String[] args) {
       String a = "abcd", d = "abcde"; //"e"
      solve(a,d);
        System.out.println("***************************************");

       String b = "", c = "y"; //"y"
        solve(b,c);
    }
}

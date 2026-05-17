package lld1.DSA.strings.task;

import java.awt.*;

public class ReverseTheString {
    public static void solve(String str){
        int n=str.length();
        String[]words=str.trim().split("\\s+");
        String rev="";
        for(int i= words.length-1;i>=0;i--){
            rev+=words[i];
            if(i>0){
                rev+=" ";
            }
        }

        System.out.println(rev);
    }
    public static void main(String[] args) {
      String  A = "the sky is blue";//"blue is sky the"
        solve(A);
      String B = "this is ib";//"ib is this"
        solve(B);
        String c="crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv";//hv xdq op qoddptokkz vemmoxrgf ombt gg crulgzfkif


    }
}

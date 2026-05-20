package lld1.DSA.strings.leetcode_string;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class ReverseVowelsofString {
    public static void solve(String a) {
        int n = a.length();
        int start=0; int end=n-1;
        StringBuilder builder=new StringBuilder();
        char[]ch=a.toCharArray();
        while (start<end){
            if(!isVowel(ch[start])){
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            }else {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;end--;
            }
            builder.append(ch[start]);
        }
        System.out.print(String.valueOf(ch)+" ");
    }
    private static boolean isVowel(char ch){
        if(ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U' || ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    //s.matches("[aeiouAEIOU]")
    public static void main(String[] args) {
        String a = "IceCreAm";   // "AceCreIm"
            solve(a);
            // find all vovels rotate the, and fix them back
        System.out.println();
        String b = "leetcode";      // "leotcede"
        solve(b);
    }
}

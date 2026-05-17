package lld1.DSA.strings.split;

import lld1.DSA.strings.substring.SubStrings;

public class ReverseEachWord {
    public static  void solve(String str){
        int n=str.length();
       String[] word=str.trim().split(" ");
       for(int i=0;i<word.length;i++) {
           StringBuilder sb=new StringBuilder();
           sb.append(word[i]);
           sb.reverse();
//           System.out.print(sb.toString()+" ");
       }
    }
    public static void reverse(String str){
        int n=str.length();
        String []ws=str.trim().split("\\s+");
        for(int i=0;i<ws.length;i++){
            String world=ws[i];
            for(int j= world.length()-1;j>=0;j--){
                System.out.print(world.charAt(j));
            }
            System.out.print(" ");
        }


    }
    public static void main(String[] args) {
        solve("Java is easy");//avaJ si ysae
        reverse("i love uzhhorod");//avaJ si ysae
    }
}

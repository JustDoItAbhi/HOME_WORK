package lld1.DSA.strings.task;

public class NonRepeatingCharacter {
    public static void solve(String str){
        int n=str.length();
        int[]freq=new int[256];
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        char ans=' ';
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(freq[ch]==1){
                ans=ch;
           break;
            }
        }
     if(ans!=' '){
         System.out.println(ans);
     }else {
         System.out.println("No unique character");

     }
    }
    public static void main(String[] args) {
        solve("leetcode");
        solve("aabbcc");
    }
}

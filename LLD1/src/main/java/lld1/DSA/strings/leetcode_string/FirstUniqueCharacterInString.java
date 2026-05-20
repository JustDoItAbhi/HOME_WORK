package lld1.DSA.strings.leetcode_string;

public class FirstUniqueCharacterInString {
    public static int solve(String s){
        int n=s.length();
        int[]freq=new int[256];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(freq[ch]==1){
                return i;
            }


        }
        return -1;
    }

    public static void main(String[] args) {
    String s = "leetcode";//0
        System.out.println(solve(s));
    String t = "loveleetcode";//2
        System.out.println(solve(t));

    String v = "aabb";//-1
        System.out.println(solve(v));
    }
}

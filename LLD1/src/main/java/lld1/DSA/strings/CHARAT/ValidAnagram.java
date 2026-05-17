package lld1.DSA.strings.CHARAT;

public class ValidAnagram {
    public static boolean solve(String a , String b){
        int n=a.length();
        int m=b.length();
        if(n!=m){
            return false;
        }
        int[]freqA=new int[256];
        int[]freqB=new int[256];
        for(int i=0;i<n;i++){
            char ch=a.charAt(i);
            char ch2=b.charAt(i);
            freqA[ch]++;
            freqB[ch2]++;
        }
        int count=0;
        for(int i=0;i<n;i++){
            char ch=a.charAt(i);
            char ch2=b.charAt(i);
            if(freqA[ch]==freqB[ch2] ){
               count++;
            }
        }
        if(count==n){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(solve("hello","world"));
        System.out.println(solve("listen","silent"));
        System.out.println(solve("aab","bcc"));
    }
}

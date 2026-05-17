package lld1.DSA.strings.CHARAT;

public class CheckAllUniqueCharacters {
    public static boolean solve(String  str){
        int n=str.length();
        int[]freq=new int[256];
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            freq[ch]++;
            if(freq[ch]>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(solve("abcdef"));
        System.out.println(solve("hello"));

    }
}

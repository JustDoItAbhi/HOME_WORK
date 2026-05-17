package lld1.DSA.strings.task;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void solve(String str){
        int n=str.length();
        int asn=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
             String sub=str.substring(i,j);

             if(isSubStringMatch(sub)){
                 asn=Math.max(asn,sub.length());
                }
            }
        }
//        System.out.println(asn);
    }
    public static boolean isSubStringMatch(String str){
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

    public static  void optimized(String str){
        int n=str.length();
        int[]freq=new int[256];
        int left=0;
        int max=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            freq[ch]++;
            while (freq[ch]>1){
                freq[str.charAt(left)]--;
                left++;
            }
            int length=i-left+1;
            max=Math.max(max,length);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        solve("abcabcbb");
        optimized("abcabcbb");//3
        System.out.println();
        optimized("bbbbb");//1
        System.out.println();
        optimized("pwwkew");//3
    }
}

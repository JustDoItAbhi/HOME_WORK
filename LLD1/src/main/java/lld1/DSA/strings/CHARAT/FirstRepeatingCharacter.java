package lld1.DSA.strings.CHARAT;

public class FirstRepeatingCharacter {
    public static void solve(String str){
        int n=str.length();
        int[]freq=new int[256];
        for (int i=0;i<n;i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<n;i++){
            if(freq[str.charAt(i)]>1){
                System.out.println(str.charAt(i)+" ");
                freq[str.charAt(i)]=0;
                break;
            }
        }
    }
    public static void main(String[] args) {
        solve("abccde");
        solve("hello");
       solve("racecar");
    }
}

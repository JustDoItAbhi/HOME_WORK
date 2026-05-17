package lld1.DSA.strings.CHARAT;

public class SecondHighestFrequency {
    public static char solve(String str){
        int n=str.length();
        int[]freq=new int[256];
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        char ans = ' ';
        int min=0;
for(int i=0;i<n;i++) {
    char ch = str.charAt(i);
    if (freq[ch] >min) {
        min=freq[ch];
        freq[ch]=0;
        ans=ch;
        break;
    }
}
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solve("aaabbccccdd"));
    }
}

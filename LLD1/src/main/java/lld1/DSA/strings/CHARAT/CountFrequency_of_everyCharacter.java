package lld1.DSA.strings.CHARAT;

public class CountFrequency_of_everyCharacter {
    public static void solve(String str){
        int n=str.length();
        int[]freq=new int[256];
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
      for(int i=0;i<n;i++) {
          char ch = str.charAt(i);
          if (freq[ch] != 0) {
              System.out.println(freq[ch] + " " + ch);
                freq[ch]=0;
          }
      }
    }
    public static void main(String[] args) {
        solve("hello");
    }
}

package lld1.DSA.strings.CHARAT;

public class CharacterFrequency2 {

    public static void solve(String str){
        int[]freq=new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        char result=str.charAt(0);
        int maxFreq=freq[result];
        System.out.print(" result "+maxFreq+" "+result+" ");

        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq[ch]>maxFreq){
                maxFreq=freq[ch];
                result=ch;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        solve("aabbcc");
        solve("hello");
        solve("abracadabra");
        solve("bbaacc");
    }
}
/*
most repeated character
least repeated character
duplicates
anagram checking
character counting
hashing
occurrence tracking
 */

package lld1.DSA.strings.task;

import java.util.Arrays;
import java.util.HashMap;

//You can replace at most k characters in the string with any uppercase letter.
//Return the length of the longest substring containing the same letter after performing at most k replacements.
public class LongestRepeatingCharacterReplacement {
    public static void solve(String str, int k){
        int n=str.length();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for(int j = i; j < n; j++) {
                freq[str.charAt(j) - 'A']++;
                int maxFreq = 0;
                for(int x : freq) {
                    maxFreq = Math.max(maxFreq, x);
                }
                int len = j - i + 1;
                int replace = len - maxFreq;
                if(replace <= k) {
                    ans = Math.max(ans, len);
                }
            }
        }
//        System.out.print(ans+" ");
    }
    public static void myWay(String str, int k){
        int n=str.length();
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int ans = 0;

        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int value = map.get(ch);
                map.put(ch, value + 1);
            }else{
                map.put(ch, 1);
            }

            maxFreq = Math.max(maxFreq, map.get(ch));

            int windowSize = i - left + 1;

            // invalid window
            while(windowSize - maxFreq > k) {

                char leftChar = str.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                left++;

                windowSize = i - left + 1;
            }

            ans = Math.max(ans, windowSize);
        }
        System.out.print(ans+" ");
    }
    public static void main(String[] args) {
        solve("AABABBA",1);//4
        System.out.println("--------");
        solve("ABAB",2);//4
        System.out.println("--------");
        solve("AAAA",2);//4
        System.out.println("________");
        solve("AABAAABAA",3);
        // travel the string , convert it into integers accii ,
        // start travel check if B exsists then change the number of B to number of i-1 char and then convert back to string

        myWay("AABABBA",1);//4
        System.out.println("--------");
        myWay("ABAB",2);//4
        System.out.println("--------");
        myWay("AAAA",2);//4
        System.out.println("________");
        myWay("AABAAABAA",3);
    }
}

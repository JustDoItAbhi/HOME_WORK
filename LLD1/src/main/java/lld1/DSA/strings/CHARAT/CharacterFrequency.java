package lld1.DSA.strings.CHARAT;

import java.util.Arrays;

public class CharacterFrequency {
    /*
    Task: Write a function mostFrequentChar(str) that returns the character that appears most frequently.
    If tie, return the first character that reaches the max frequency.
     */
    public static char mostFrequentChar(String str) {
        // 1. Edge cases
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        // 2. Frequency array (256 for extended ASCII)
        int[] freq = new int[256];
        int[] firstSeen = new int[256];

        // Initialize firstSeen with -1
        for (int i = 0; i < 256; i++) {
            firstSeen[i] = -1;
        }

        // 3. First pass: count and track first occurrence
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (firstSeen[ch] == -1) {
                firstSeen[ch] = i;
            }
            freq[ch]++;
        }

        // 4. Find result
        char result = str.charAt(0);
        int maxFreq = freq[result];

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                result = ch;
            } else if (freq[ch] == maxFreq) {
                // Tie-break: keep the one that appeared first in string
                if (firstSeen[ch] < firstSeen[result]) {
                    result = ch;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentChar("hello"));        // 'l'
        System.out.println(mostFrequentChar("abracadabra"));  // 'a'
        System.out.println(mostFrequentChar("aabbcc"));       // 'a'

        // Hard
        System.out.println(mostFrequentChar("AaBbAaAa"));         // 'A'
        System.out.println(mostFrequentChar("!!! hello ??? world !!!")); // '!'
        System.out.println(mostFrequentChar("a1b2c3d1e2f1g1h1")); // '1'
        System.out.println(mostFrequentChar("zzyyxxwwvvuuttssrrqqppoonnmmllkkjjiihhggffeeddccbbaa")); // 'z'

        // Edge cases
        System.out.println(mostFrequentChar(""));              // '\0'
        System.out.println(mostFrequentChar(null));


    }
}

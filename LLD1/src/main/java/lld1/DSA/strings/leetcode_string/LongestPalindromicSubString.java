package lld1.DSA.strings.leetcode_string;

public class LongestPalindromicSubString {
    public static String solve(String str){
        int n = str.length();

        if (n == 0) {
            return "";
        }
        String ans = "";

        for (int i = 0; i < n; i++) {

            // Odd length palindrome
            String odd = expand(str, i, i);

            // Even length palindrome
            String even = expand(str, i, i + 1);

            if (odd.length() > ans.length()) {
                ans = odd;
            }

            if (even.length() > ans.length()) {
                ans = even;
            }
        }

        return ans;
    }
    public static String expand(String str, int i, int j) {

        while (i >= 0 &&   j < str.length() &&  str.charAt(i) == str.charAt(j)) {
            i--;
            j++;
        }

        return str.substring(i + 1, j);
    }

    public static void main(String[] args) {
        solve("aaaabaaa");
        System.out.println();
        solve("abba");
    }
}

package lld1.DSA.strings.substring;

public class CheckPalindromeSubstrings {
    public static void solve(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (isPalindrome(str.substring(i, j))) {
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }
    public static boolean isPalindrome(String str){
        int right=str.length()-1; int left=0;
        while (right>left){
            if(str.charAt(right)!=str.charAt(left)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
    public static void main(String[] args) {
        solve("madam");
    }
}

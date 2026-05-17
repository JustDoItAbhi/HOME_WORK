package lld1.DSA.strings.CHARAT;

public class PalindromeChecker {
    public static void isPalindrome(String str){
       String cleaned="";
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch!=' '){
               if(ch>='A' && ch<='Z'){
                   ch= (char) (ch+32);
               }
               cleaned+=ch;
           }
        }
        System.out.println(cleaned);
       int n=cleaned.length();
       boolean isPalindrome=true;
       for(int i=0;i<n/2;i++){
//           Question 1: Why n/2 in the loop? 🤔
//           Answer: Because you only need to check half the string. When comparing first with last, second with second-last, etc., you automatically verify both halves at once.
//           Example: "racecar" (length 7)
//           i=0 compares index 0 with 6 ✓
//           i=1 compares index 1 with 5 ✓
//           i=2 compares index 2 with 4 ✓
//           i=3 would compare index 3 with 3 (same character) - Unnecessary!
//           So n/2 = 3 iterations is enough. Checking the middle character with itself is redundan
//           Question 2: Why n-i-1? 🧮
//           Answer: This is the formula to get the mirror index from the end.
//           For string "racecar" (n=7):
//           i=0 → n-i-1 = 7-0-1 = 6 (last character)
//           i=1 → n-i-1 = 7-1-1 = 5 (second last)
//           i=2 → n-i-1 = 7-2-1 = 4 (third last)
//
//           Index:    0   1   2   3   4   5   6
//           Char:     r   a   c   e   c   a   r
//          ↑                       ↑
//           i=0                   n-i-1=6
//              ↑               ↑
//           i=1           n-i-1=5
//                  ↑       ↑
//           i=2   n-i-1=4
//           The -1 is needed because indices start at 0, not 1.
           if(cleaned.charAt(i)!=cleaned.charAt(n-i-1)){
                isPalindrome=false;
                break;
           }
        }
        System.out.print(isPalindrome);
    }
    public static void main(String[] args) {
        isPalindrome("A man a plan a canal panama");// → true
        System.out.println();
        isPalindrome("racecar");// → true
        System.out.println();
        isPalindrome("hello");// → false
        System.out.println();
        isPalindrome("No lemon no melon"); // true
    }
}

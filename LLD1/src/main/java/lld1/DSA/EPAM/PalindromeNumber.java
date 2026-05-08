package lld1.DSA.EPAM;

public class PalindromeNumber {
    public static boolean solve(int x){
        int temp=x;
        int rem=0;
        int reverse=0;
        while (x>0) {
            rem = x % 10;
            reverse=reverse*10+rem;
            x = x/ 10;
        }

        return temp==reverse;
    }
    public static void main(String[] args) {
        int x = 121;
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.
        System.out.println("ans1 = "+solve(x));

        int y = -121;
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        System.out.println("ans2 = "+solve(y));

        int z = 10;
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
        System.out.println("ans3 = "+solve(z));

    }
}

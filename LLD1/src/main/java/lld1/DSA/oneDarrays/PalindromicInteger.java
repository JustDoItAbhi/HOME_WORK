package lld1.DSA.oneDarrays;

public class PalindromicInteger {
    //You are given an integer A as input and you need to determine whether it is a palindrome or not.
    //A palindrome integer is one whose digits, when reversed, result in the same number.
    //For example, 121 is a palindrome because its reverse is also 121, but 123 is not a palindrome because its reverse is 321.
    //
    //Note: The given integer will not have any leading zeros.
    public static void  solve(int n){
        int rem=n%10;
        int rev=0;
        int anotherNumber=n;
        for (;n>0;n/=10){
           rev= rev*10+n%10;

            System.out.print(rev+" rev ");
//
//            if(n==rev){
//                System.out.println(" value matched");
//            }else {
//                System.out.println("no");
//            }
        }
        if(anotherNumber==rev){
            System.out.println(" value matched");
        }else {
            System.out.println(" NO");
        }
    }
    public static void main(String[] args) {
        int a=121;
        solve(a);
        System.out.println();
        int b=123;
        solve(b);
    }
}

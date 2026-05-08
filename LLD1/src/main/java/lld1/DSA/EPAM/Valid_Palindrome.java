package lld1.DSA.EPAM;

import java.io.Console;

public class Valid_Palindrome {
    public static boolean solve(String arr){
        int n=arr.length();

        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<n;i++){
           char ch=arr.charAt(i);
           if(Character.isLetterOrDigit(ch)){
               stringBuilder.append(Character.toLowerCase(ch));
           }
        }
        String orignal=stringBuilder.toString();
        String reversed=stringBuilder.reverse().toString();
        return orignal.equals(reversed);
    }


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama" ;//Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
        System.out.println(solve(s));

        String t = "race a car";//        Output: false
//        Explanation: "raceacar" is not a palindrome.
        System.out.println(solve(t));

        String u = " ";//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//                Since an empty string reads the same forward and backward, it is a palindrome.
        System.out.println(solve(u));
    }
}

package lld1.DSA.strings.split;

import lombok.val;

public class ValidPalindrome {
    public static boolean solve(String str){
        int n=str.length();
      int left=0; int right=n-1;
      while (left<right){
          char l=str.charAt(left);
          char r=str.charAt(right);
          if(!Character.isLetterOrDigit(l)){
              left++;
              continue;
          }
          if(!Character.isLetterOrDigit(r)){
              right--;
              continue;
          }
          if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
              return false;
          }
          right--; left++;
      }
        return true;
    }
    public static void main(String[] args) {

        String str="A man, a plan, a canal: Panama";
        System.out.println(solve(str));
    }
}

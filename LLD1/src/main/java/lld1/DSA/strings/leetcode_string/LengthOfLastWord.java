package lld1.DSA.strings.leetcode_string;

public class LengthOfLastWord {
    public static int solve(String str){
        int n=str.length();
        String []correct=str.trim().split("\\s+");
    int size=0;
 for(int i= correct.length-1;i< correct.length;i++){
   size=  correct[i].length();
 }
        return size;
    }
    public static void main(String[] args) {
        String s = "Hello World";//5
        System.out.println(solve(s));
        String t = "   fly me   to   the moon  ";//4
        System.out.println(solve(t));
        String r = "luffy is still joyboy";//6.
        System.out.println(solve(r));

        // travel and remove extra spaces from string ,
        // first find last word,
        // store it in string , and print length of string
    }
}

package lld1.DSA.strings.substring;

public class PrintLast3Characters {
    public static void solve(String str){
        int n=str.length();
        System.out.println(str.substring(n-3,n));
    }
    public static void main(String[] args) {
      String val="computer";
     solve(val);
    }
}

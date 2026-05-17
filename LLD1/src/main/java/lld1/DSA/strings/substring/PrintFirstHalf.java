package lld1.DSA.strings.substring;

public class PrintFirstHalf {
    public static void solve(String str){
        int n=str.length();
        String ans="";
        ans  = str.substring(0, n/2);
        System.out.print(ans+" ");

    }
    public static void main(String[] args) {
       solve("banana");
        System.out.println();
       solve("hello");

    }
}

package lld1.DSA.strings.substring;

public class RemoveFirstCharacter {
    public static void solve(String str){
       String ans= str.substring(1,str.length());
        System.out.println(ans);
    }
    public static void main(String[] args) {
        solve("hello");
    }
}

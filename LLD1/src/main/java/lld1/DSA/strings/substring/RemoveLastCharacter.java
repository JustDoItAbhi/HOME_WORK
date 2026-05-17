package lld1.DSA.strings.substring;

public class RemoveLastCharacter {
    public static void solve(String str){
        System.out.println(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) {
        solve("world");
    }
}

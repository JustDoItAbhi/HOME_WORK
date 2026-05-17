package lld1.DSA.strings.split;

public class CountNumberofWords {
    public static void solve(String str) {
        String[]wrods=str.trim().split("\\s+");
        System.out.println(wrods.length);
    }
    public static void main(String[] args) {
        solve("I love learning Java");
    }
}

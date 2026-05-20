package lld1.DSA.strings.leetcode_string;

public class ExcelSheetColumnNumber {
    public static void solve(String a){
        int result =0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            result = result * 26 + (ch - 'A' + 1);
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String a = "A";//1
        solve(a);
        String b = "AB";//28
        solve(b);
//
//        String c = "ZY";//701
//        solve(c);
    }
}

package lld1.DSA.strings.split;

public class ConvertCSVStringIntoArray {
    public static void solve(String str){
        String[] val=    str.split(",");
    for(String ans:val){
        System.out.println(ans.trim());
    }
    }
    public static void main(String[] args) {
        String str= "apple,banana,mango";
        solve(str);
    }
}

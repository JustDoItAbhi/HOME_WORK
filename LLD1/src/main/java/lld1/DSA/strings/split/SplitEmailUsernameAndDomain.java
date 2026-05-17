package lld1.DSA.strings.split;

public class SplitEmailUsernameAndDomain {
    public static void solve(String str){
        String[] ws=str.split("@");
        String username=ws[0];
        String domin=ws[1];
        System.out.println("username "+username);
        System.out.println("domin "+ domin);

    }
    public static void main(String[] args) {
        solve("abc@gmail.com");
    }
}

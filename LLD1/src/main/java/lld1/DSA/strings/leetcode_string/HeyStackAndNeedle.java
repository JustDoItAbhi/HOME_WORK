package lld1.DSA.strings.leetcode_string;

public class HeyStackAndNeedle {
    public static void solve(String a, String b){
        int n=a.length();
        int m=b.length();
        for(int i=0;i<n-m+1;i++){
        if(a.charAt(i)==b.charAt(0)){
            if(a.substring(i,m).equals(b)){
                System.out.println(a.substring(i,m));
                break;
            }else {
                System.out.println(-1);
            }
        }
        }
        }
    public static void main(String[] args) {
        solve("sadbutsad","sad");
        System.out.println("______");
        solve("leetcode","leeto");
    }
}

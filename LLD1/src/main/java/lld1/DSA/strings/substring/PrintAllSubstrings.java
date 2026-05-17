package lld1.DSA.strings.substring;

public class PrintAllSubstrings {
    public static void solve(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++) {
                System.out.println(str.substring(i,j)+" ");
            }
        }
    }
    public static void main(String[] args) {
        solve("abc");
    }
}

package lld1.DSA.strings.substring;

public class CountAllSubstrings {
    public static void solve(String str){
        int n=str.length();
        int count =0;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<=n;j++){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        solve("abc");
    }
}

package lld1.DSA.strings.task;

public class StringCompression {
    public static void solve(String str){
        int n=str.length();
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else {
                sb.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        sb.append(str.charAt(n-1)).append(count);


        System.out.println(sb.toString());
    }
    public static boolean isPalindrom(String str){
        int n=str.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev+=str.charAt(i);
        }

        return str.equals(rev);
    }
    public static void main(String[] args) {
//        solve("aaabbcc");//a3b2c2
//        solve("aaabbcaa");//a3b2c1a2
        System.out.println(isPalindrom("mada"));
    }
}

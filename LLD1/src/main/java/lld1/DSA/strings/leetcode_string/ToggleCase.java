package lld1.DSA.strings.leetcode_string;

public class ToggleCase {
    public static String solve(String str){
        int n=str.length();
       StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch+=32;
                sb.append(ch);
            }else if(ch>='a' && ch<='z') {
                ch -= 32;
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(solve("Hello"));//  hELLO
        System.out.println(solve("tHiSiSaStRiNg"));
        System.out.println(solve("FbxdWdoKwrezJPP"));//fBXDwDOkWREZjpp
    }
}

package lld1.DSA.strings.leetcode_string;

public class Tolower {
    public static char[] solve(char[]ch){
        int n=ch.length;
        char[]sh=new char[n];
        for(int i=0;i<n;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]+=32;
                sh[i]=ch[i];
            }else {

                sh[i]=ch[i];
            }
        }return sh;
    }
    public static void main(String[] args) {
        char[]arr={'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        char[]ans=solve(arr);
        for(char x:ans){
            System.out.print(x+" ");
        }
    }
}

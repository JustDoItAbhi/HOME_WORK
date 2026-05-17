package lld1.DSA.strings.substring;

public class SubStrings {
    public static void extractMiddle(String str){
        int n=str.length();
        int mid =n/2;
        if(n<2){
            System.out.println(str);
        }
        else if(n%2==0 ){
            System.out.println(str.substring(mid-1,mid+1));
        }else {
            System.out.println(str.substring(mid-1,mid+2));
        }
    }
    public static void main(String[] args) {
        extractMiddle("javascript");   // "sc"
        extractMiddle("abcdef");       // "cd"
        extractMiddle("hello");        // "ell"
        extractMiddle("abcdefg");      // "cde"
        extractMiddle("hi");           // "hi"
        extractMiddle("a");            // "a"
    }

}

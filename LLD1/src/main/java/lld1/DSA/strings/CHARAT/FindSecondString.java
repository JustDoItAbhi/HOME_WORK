package lld1.DSA.strings.CHARAT;

public class FindSecondString {
    public static void getEverySecondChat(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
           if(i%2==0){
               System.out.print(str.charAt(i));
           }
            }
        String ans="";
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String str="hello";
        getEverySecondChat(str);
        System.out.println();
        String abc="abcdef";
        getEverySecondChat(abc);
    }
}

package lld1.DSA.strings.split;

public class FindLongestWord {
    public static  void solve(String str){
        int n=str.length();
        String []ws=str.trim().split("\\s+");
       String length = "";
        for (int i=0;i<ws.length;i++){
            if(ws[i].length()>length.length()){
               length=ws[i];
            }
        }
        System.out.println(length);
    }
    public static void main(String[] args) {
        solve("I love programming in Java");
    }
}

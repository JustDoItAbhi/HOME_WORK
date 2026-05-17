package lld1.DSA.strings.task;

public class LongestPalindromicSubstring {
   public static void solve(String str){
    int n=str.length();
       char[]ch=str.toCharArray();
       String ans="";
       int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
              String val=   str.substring(i,j);
              if(isPalindrom(val)){
                  int length=val.length();
                 max=Math.max(max,length);
                    if(length==max){
                        ans=val;
                    }
            }
        }
    }
       System.out.println(ans);
   }
   private static boolean isPalindrom(String str){
       int left =0;int right =str.length()-1;
       while (left<right){
           System.out.println(str.charAt(left)+" ---- "+str.charAt(right));
           if(str.charAt(left)!=str.charAt(right)){

               return false;
           }
           right--;left++;
       }
       return true;
   }
   public static void optimial(String str){
       int n=str.length();
      String ans="";
     for(int i=0;i<n;i++){
             String even=yesPalindrom(str,i,i);
             String odd=yesPalindrom(str,i,i+1);
            if(odd.length()>ans.length()){
                ans=odd;
            }
            if(even.length()>ans.length()){
                ans=even;
            }
     }
       System.out.println(ans);
   }
    public static String yesPalindrom(String str, int i, int j) {
        while (i >= 0 &&   j < str.length() &&  str.charAt(i) == str.charAt(j)) {
            i--;
            j++;
        }

        return str.substring(i + 1, j);
    }
    public static void main(String[] args) {
//        solve("babad");//bab or aba
        optimial("babad");//bab or aba
//        System.out.println(isPalindrom("babad"));//bab or aba
    }
}

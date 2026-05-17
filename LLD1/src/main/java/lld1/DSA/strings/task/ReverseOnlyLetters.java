package lld1.DSA.strings.task;

public class ReverseOnlyLetters {
    public static void solve(String str){
        int n=str.length();
        char[]ch=str.toCharArray();
        char[]sh=str.toCharArray();

       int left =0; int right =ch.length-1;
       while (left<right){
           if(!Character.isLetter(ch[left])){
               left++;
           }else if(!Character.isLetter(ch[right])){
               right--;
           }else {
               char temp = ch[left];
               ch[left] = ch[right];
               ch[right] = temp;
               left++;
               right--;
           }
       }
        System.out.println(new String(ch)+" +++++++ ");

    }
    public static void main(String[] args) {
        solve("a-bC-dEf");//f-eD-cBa
        //      i       n-1
        // make ch[a]=ch[f]
            // swipe ch[a] with ch[f]
            // i++ , and j--;
    }
}

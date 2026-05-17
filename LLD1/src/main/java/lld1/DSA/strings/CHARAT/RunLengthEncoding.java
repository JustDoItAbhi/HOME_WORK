package lld1.DSA.strings.CHARAT;

public class RunLengthEncoding {
    public static void runLengthEncode(String str){
        int n=str.length();

        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(i<n-1 && ch==str.charAt(i+1)){
                count++;
            }else{
                sb.append(ch);
                if(count>1){
                    sb.append(count);
                }
                count=1;
            }

        }

        System.out.println(sb.toString()+" ");
    }
    public static void main(String[] args) {
        runLengthEncode("aaabbc") ;// "a3b2c"
        System.out.println("-----------");
        runLengthEncode("hello") ;// "hel2o"  (l appears twice consecutively)
        System.out.println("-----------");

        runLengthEncode("abcd") ;// "abcd"    (no repeats, so no numbers)
        System.out.println("-----------");

        runLengthEncode("aabbaa") ;// "a2b2a2"
    }
}

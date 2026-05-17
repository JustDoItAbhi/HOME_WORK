package lld1.DSA.strings.CHARAT;

public class CountVowels {
    public static int countVowels(String str){
        int n=str.length();
      int count =0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='e'||str.charAt(i)=='a'){
                count++;
            }else if(str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='E'||str.charAt(i)=='A'){
                count++;
            }
        }
      
        return  count;
    }
    public static void main(String[] args) {
        System.out.println(countVowels("Hello World")); //→ 3  (e, o, o)
        System.out.println(countVowels("AEIOU")); //→ 5
        System.out.println(countVowels("rhythm"));// → 0
    }
}

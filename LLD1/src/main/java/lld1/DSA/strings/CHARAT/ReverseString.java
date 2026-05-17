package lld1.DSA.strings.CHARAT;

public class ReverseString {
    public static void reverseString(String s){
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        reverseString("hello"); //→ "olleh"
        System.out.println();
        reverseString("Java"); //→ "avaJ"
    }
}

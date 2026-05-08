package lld1.DSA.EPAM;

public class Reverse_String {
    public static void solve(char[]s){
        StringBuilder sb=new StringBuilder(String.valueOf(s));
        sb.reverse();
        for(int i=0;i<s.length;i++)
        {
            s[i]=sb.charAt(i);
        }

        for(char x:s){
            System.out.print(x+" ");
        }
    }
    public static void reverseString(char[] s) {
//        int left =0;
//        int right=s.length-1;
//        while (left<right){
//            char temp=s[left];
//            s[left]=s[right];
//            s[right]=temp;
//            left++;right--;
//        }
//        for(char x:s){
//            System.out.print(x+" ");
//        }

    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        solve(s);
        System.out.println();
        char[] x = {'H','a','n','n','a','h'};
        reverseString(x);
        solve(x);
    }
}

package lld1.DSA.EPAM;

public class PrintAllABC {
    public static void main(String[] args) {
        for(char ch='a';ch<='z';ch++){
            System.out.print(ch+" ");
        }
        int count=0;
        for(char ch=0;ch<300;ch++){
           count++;
            System.out.println(count+" -> "+ch+" ");
        }
    }
}

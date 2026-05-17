package lld1.DSA.strings.leetcode_string;

public class RomanToInteger {
    public  static void solve(String str){
    int n=str.length();
    int sum=0;
    for(int i=0;i<n;i++){
        int current=romans(str.charAt(i));
        if(i+1<n && current < romans(str.charAt(i+1))) {
            sum -=current;
        }else {
            sum+=current;
        }
    }
        System.out.println(sum);
//        System.out.println(sum);

    }
    private static int romans(Character i){
        switch (i){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }

    }
    public static void main(String[] args) {
        solve("III");
        solve("LVIII");
        solve("MCMXCIV");
    }
}

package lld1.LLD1.oneDarrays;

public class LCM {
    public static int solve(int a,int b){
        int gcd=0;
        int min=0;
        if(a<b){
            min=b;
        }else {
            min=a;
        }
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        int lcm=(a*b)/gcd;
        return lcm;
    }


    public static void main(String[] args) {
        int a=5;
        int a1=10;
        System.out.println(solve(a,a1));
        int b=2;
        int b1=3;
        System.out.println(solve(b,b1));
    }
}

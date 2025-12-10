package lld1.LLD1.oneDarrays;

public class HCL {
    public static int solve(int a,int b){
        int hcl=0;
        int max=0;
        if(a<b){
        max=b;
        }else {
            max=a;
        }
        for(int i=1;i<=max;i++){
            if(a%i==0 && b%i==0){
           hcl=i;
            }
        }
        return hcl;
    }


    public static void main(String[] args) {
        int a=15;
        int a1=105;
        System.out.println(solve(a,a1));
        int b=24;
        int b1=36;
        System.out.println(solve(b,b1));
    }
}

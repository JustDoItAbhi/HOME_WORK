package lld1.DSA.oneDarrays;

public class Easy_Power {
    //You are given two integers A and B. You have to find the value of AB.
    //NOTE: The value of AB will always be less than or equal to 109.
    public static void solve(int a,int b){
        int sum=0;
    for(int i=1;i<=a;i++){
        int ans=a*a;
        sum+=ans;
    }
        System.out.print(sum+" ");
    }
    public static void main(String[] args) {
        int a=2;
        int a1=3;
        solve(a,a1);
        System.out.println();
        int b=1;
        int b1=10;
        solve(b,b1);
    }
}

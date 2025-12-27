package lld1.DSA.oneDarrays;

public class SumOfEvenNumbers {
    public static int solve(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            int md=i%2;
            if(md==0){
                System.out.print(i+" ");
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(solve(a));
        int b=2;
        System.out.println(solve(b));
    }
}

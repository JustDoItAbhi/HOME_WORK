package lld1.LLD1.oneDarrays;

public class FirstAndLastDigit {
    public static void solve(int arr){
        int lastDigit =arr%10;
        int firstDigit =arr;
        for(;firstDigit>=10;){
                firstDigit/=10;
        }
        System.out.print("first "+ firstDigit+" last "+lastDigit);
    }
    public static void OptimizedApproch(int n){
        int lastDigit=n%10;
        int digit =(int)Math.log10(n);
        System.out.println("digit "+digit);
        int firstDigit= (int) (n/Math.pow(10,digit));
        System.out.println(firstDigit+" "+lastDigit);
    }
    public static void main(String[] args) {
        int v= 1001;
        solve(v);
        System.out.println();

        OptimizedApproch(v);
        System.out.println();
        int a=15;
        solve(a);
        System.out.println();

        OptimizedApproch(a);

    }
}

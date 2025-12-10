package lld1.LLD1.oneDarrays;

public class isPrime {
    public static String solve(int a){
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if (count==2){
            return "YES";
        }
        return "NO";
    }


    public static void main(String[] args) {
        int a=3;
        System.out.println(solve(a));
        int b=4;
        System.out.println(solve(b));
    }
}

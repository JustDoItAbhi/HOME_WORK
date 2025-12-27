package lld1.DSA.dsa1.prefixsum;

public class PrifixSum {
    public static int[] solve(int[]arr){
        int n=arr.length;
        int sum=0;
        int[]ps=new int[n];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            ps[i]=sum;
//            System.out.println(sum+" ");
        }
        return ps;
    }

    public static int[] prefixSum(int[]arr){
        int n=arr.length;
        int[]ps=new int[n];
        ps[0]=arr[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        return ps;
    }


    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
            solve(arr);

        int[]ans1=solve(arr);
        for(int x:ans1){
            System.out.print(x+" ");
        }
        System.out.println("___________");
        int[]ans=prefixSum(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}

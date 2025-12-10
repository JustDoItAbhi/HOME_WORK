package lld1.LLD1.oneDarrays;

public class CopyOfArray {
    public static int[] solve(int[]arr,int a){
        int n=arr.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
        ans[i]=arr[i]+a;

        }

        return ans;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,2,1};
        int a=3;
        int[]ans=solve(arr,a);
        for(int x:ans){
            System.out.print(x+" ");
        }
        System.out.println("");

        int[]arr1={1,1,10};
        int b=6;
        int[]ans1=solve(arr1,b);
        for(int x:ans1){
            System.out.print(x+" ");
        }
    }
}

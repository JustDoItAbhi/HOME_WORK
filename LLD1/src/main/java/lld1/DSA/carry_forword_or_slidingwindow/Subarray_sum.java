package lld1.DSA.carry_forword_or_slidingwindow;

public class Subarray_sum {
    public static int solve (int[]arr, int k){
        int n=arr.length;
        int ans=0;

        for(int i=0;i<k;i++){
            ans+=arr[i];
        }
        int sum=ans;

        int s=1;
        int e=k;
        while (e<n){
                    sum=ans-arr[s-1]+arr[e];
            if(s>ans){
                sum=ans;

            }
            e++;
            s++;
        }

        return sum;
    }
    public static void main(String[] args) {
        int[]arr={3,9,4,-2,5,13,-7,8};
                        //19, 29, 10
        int k=4;
        System.out.println(solve(arr,k));

    }
}

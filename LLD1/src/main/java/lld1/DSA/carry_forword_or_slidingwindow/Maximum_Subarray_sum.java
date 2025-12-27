package lld1.DSA.carry_forword_or_slidingwindow;

public class Maximum_Subarray_sum {
    public static int solve(int [] arr , int k){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int ans=sum;

        int s=1;int e=k;
        while (e<n){
            sum=sum- arr[s-1]+arr[e];
           if(sum>ans){
               ans=sum;
           }
        e++;s++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={6, 7, 8, 2};
        int k=2;
        System.out.println(solve(arr,k));
        System.out.println("____________");
        int[]arr1={3, 9, 5, 6, 5, 11};
        int b=3;
        System.out.println(solve(arr1,b));

    }
}

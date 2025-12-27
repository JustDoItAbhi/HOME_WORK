package lld1.DSA.dsa1.subarrays;

public class Range_Sum_II {
//You are given an integer array A of size N. You need to perform Q queries on the given array and return the final array after processing all the queries.
//
//Each query is of the form (l, r, c), where l and r are indices (1-based) representing a range in the array A, and c is an integer value.
//
//For each query, you are required to add the value c to every element within the range [l, r] (inclusive).

    public static int[] solve(int[]arr,int[][]q){
        int n=arr.length;
        int[]ans=new int[n];
        for(int i=0;i<q.length;i++){
            int s=q[i][0]-1;
            int e=q[i][1]-1;
            int val=q[i][2];
            ans[s]+=val;

            if(e+1<n){
                ans[e+1]-=val;
            }
        }
        for(int i=1;i<n;i++){
//            System.out.print(ans[i]+" ");
            ans[i]+=ans[i-1];
        }
        for(int i=0;i<n;i++){
            arr[i]+=ans[i];
        }
//        System.out.println();
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={1, 2, 1, 4};
        int[][]devotess={
                {2,3,2},
                {1,4,5},
                {4,4,1},
        };
        int[]ans =solve(arr,devotess);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }
        System.out.println();
        int[]arr1={1, 1, 2};
        int[][]devotess1={
                {2,3,2},
                {1,3,5},
        };
        int[]ans1 =solve(arr1,devotess1);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }
    }
}

package lld1.DSA.hashmap;

import java.util.HashMap;

public class Subarray_with_0_sum {
    //iven an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
    //If the given array contains a sub-array with sum zero return 1, else return 0.
    public static int solve(int[]arr){
        int n= arr.length;

        for(int i=0;i<n;i++) {
        for(int j=i;j<n;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
                sum+=arr[k];
             if (sum==0){
                 return 1;
             }
            }
        }
        }

        return 0;
    }
    public static int optm(int[]arr){
        int n= arr.length;
        int[]ps=new int[n];
        ps[0]=arr[0];
        for(int i=1;i<n;i++) {
            ps[i]=ps[i-1]+arr[i];
        }
            for(int i=0;i<n;i++){
                if(ps[i]==0){
                   return 1;
                }
            }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ps[i]==ps[j]){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static int hashing(int[]arr){
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum==0){
                return 1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,1);
            }else {
         return 1;
            }
        }

        return 0;
    }


    public static void main(String[] args) {
        int[]arr={3, -3, 4};//1
                 //0   1  2  3  4  5  6
        System.out.println("(on3)"+solve(arr));
        System.out.println("(on2)"+optm(arr));
        System.out.println("on "+hashing(arr));

        System.out.println("_______");
        int[]arr3={4,-1,1};//1
        System.out.println("(on3)"+solve(arr3));
        System.out.println("(on2)"+optm(arr3));
        System.out.println("on "+hashing(arr3));
        System.out.println("_______");
        int[]arr4={1, 2, 3, 4, 5};//0
        System.out.println("(on3)"+solve(arr4));
        System.out.println("(on2)"+optm(arr4));
        System.out.println("on "+hashing(arr4));
    }
}

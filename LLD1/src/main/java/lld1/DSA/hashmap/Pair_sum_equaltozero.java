package lld1.DSA.hashmap;

import java.util.HashSet;

public class Pair_sum_equaltozero {
    public static void brute(int[]arr,int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int x=k-arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]==x){
//                    System.out.println(true);
                }
            }
        }
    }
    public static boolean solve(int[]arr,int k){
        int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
                int x=k-arr[i];
                if(set.contains(x)){
                   return true;
                }
                set.add(x);
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr={4,9,4,6,7,6,8};
        int k=12;
        brute(arr,k);
        System.out.println(solve(arr,k));
    }
}

package lld1.DSA.hashmap;

import java.util.HashSet;

public class SubaarayWIthSumZero {
    public static void brute(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for (int j=i;j<n;j++) {
                sum+=arr[j];
            if(sum==0){
//                System.out.print(" brute force "+i+" to "+ j);
            }

            }
        }
    }
    public static void solve(int[]arr) {
        int n = arr.length;
        HashSet<Integer>map=new HashSet<>();
        int[]ps=new int[n];
        ps[0]=arr[0];
        for (int i = 1; i < n; i++) {
            ps[i]=ps[i-1]+arr[i];

        }
        for (int i = 0; i < n; i++) {
            if(ps[i]==0){
                System.out.print(0);
            }
            map.add(ps[i]);
            System.out.print(ps[i]+" ");
        }


        if (map.size()!=n){
//            System.out.println(map+" ");
        }
    }


    public static void main(String[] args) {
        int[]arr={2,4,-1,3,-2,5,1,6};
        solve(arr);
        System.out.println();
        int[]arr1={4,3,-5,1,1,9};
               //  4 7 ,2,3,4,13
        solve(arr1);
        System.out.println();
        brute(arr1);
//        hashset(arr);
    }
}

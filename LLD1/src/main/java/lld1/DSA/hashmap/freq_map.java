package lld1.DSA.hashmap;

import java.util.HashMap;

public class freq_map {
    public static int[] solve(int[]arr, int[] q){
        int n=arr.length;
        int[]ans=new int[q.length];
        for(int i=0;i<q.length;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(q[i]==arr[j]){
                    count++;
                }
            }
            ans[i]=count;
        }
        System.out.println();

        return ans;
    }
    public static int[] hashmapSolve(int[]arr, int[]q){
        int n=arr.length;
        int[]ans=new int[q.length];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i]);
                count++;
                map.put(arr[i],count);

            }else {
               map.put(arr[i],1);
            }
        }
        for(int i=0;i<q.length;i++){

            if (map.containsKey(q[i])){
            ans[i]=map.get(q[i]);
            }else {
                ans[i]=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={2,1,2,3,1,5,4,2,1};
        int[]k={2,1,3,5,4,9};
        int[]ans=solve(arr,k);
        for(int x:ans){
//            System.out.print(" "+x+" ");
        }
        int[]ans1=hashmapSolve(arr,k);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }
    }
}

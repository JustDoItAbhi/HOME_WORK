package lld1.DSA.hashmap;

import java.util.HashMap;

public class SubArrayWithSum_equal_k {
    public static void brute(int[]arr, int k){
        int n=arr.length;
        int x=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int count =0;
        for(int i=0;i<n;i++){
              x+=arr[i];
          if(map.containsKey(x-k)){
              count +=map.get(x-k);
          }
          if(map.containsKey(x)){
              int temp=map.get(x);
              temp++;
              map.put(x,temp);
          }else {
              map.put(x,1);
          }
        }
        System.out.println(map);
        System.out.println();
        System.out.print(count+" ");
    }
    public static void solve(int[]arr, int m){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==m){
                    count++;
                }
               for(int k=i;k<=j;k++){
//                   System.out.print(arr[k]+" ");
               }
//                System.out.println();

            }
        }
//        System.out.println(" count "+count);
    }

    public static void main(String[] args) {
        int[]arr={3,1,-4,1,-2,5,6,2};
        int k=6;
        brute(arr,k);
        solve(arr,k);
//        System.out.println(solve(arr,k));
    }
}

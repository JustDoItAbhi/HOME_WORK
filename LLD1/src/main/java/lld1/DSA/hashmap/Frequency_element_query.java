package lld1.DSA.hashmap;

import java.util.HashMap;

public class Frequency_element_query {
    public static int[] solve(int[]arr,int[]q){
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i]);
                count++;
                map.put(arr[i],count);
            }
            map.put(arr[i],1);
        }
        int[]ans=new int[q.length];
        int count=0;
        for(int i=0;i<q.length;i++){
            if(map.containsKey(q[i])) {

            count++;
            }
            System.out.print(count+" ");
            ans[i]=count;
        }
        System.out.println();
return ans;
    }


    public static void main(String[] args) {
        int[]arr={1,2,1,1};
        int []b={1,2};

        int[]ans=solve(arr,b);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }

        int[]arr1={2,5,9,2,8};
        int[]c={3,2};
        int[]ans1=solve(arr1,c);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }
    }
}

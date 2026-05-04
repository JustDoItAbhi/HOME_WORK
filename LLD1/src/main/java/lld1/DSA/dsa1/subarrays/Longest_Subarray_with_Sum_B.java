package lld1.DSA.dsa1.subarrays;

import java.util.HashMap;

public class Longest_Subarray_with_Sum_B {
    public static int solve(int[]arr, int b) {
        int n = arr.length;
        int sum = 0;
//        int ans = 0;
        int maxlen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum==b){
                maxlen=i+1;
            }

            if (map.containsKey(sum-b)) {
                int length=i-map.get(sum-b);
                maxlen=Math.max(maxlen,length);
            }
            if(!map.containsKey(sum))
                map.put(sum, i);
            }
        return maxlen;
    }


    public static void main(String[] args) {
        int[]A={10, 5, 2, 7, 1, 9 };
        int B=15;
        System.out.println(solve(A,B));
        int[]x={1, 2, 5, 1, 3, 8};
        int y=12;
        System.out.println(solve(x,y));
    }
}

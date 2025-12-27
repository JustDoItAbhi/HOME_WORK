package lld1.DSA.dsa1.prefixsum;

public class FrequencyCountArray {
    public static int[] solve(int[]arr){
        int n = arr.length;

        // 1. Find max element
        int max = 0;
        for (int x : arr) {
            max = Math.max(max, x);
        }

        // 2. Create freq array
        int[] freq = new int[max + 1];
        System.out.println();
        // 3. Count frequencies
        for (int x : arr) {
            freq[x]++;
        }

        // 4. Build result for each index
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = freq[arr[i]];
        }
        return result;
    }
    public static void main(String[] args) {
        int[]a={1, 2, 5, 1, 5, 1};
        int[]ans=solve(a);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }
    }
}

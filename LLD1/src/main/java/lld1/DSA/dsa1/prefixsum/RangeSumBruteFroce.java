package lld1.DSA.dsa1.prefixsum;

public class RangeSumBruteFroce {
//RENGE SUM QUERY
    public static int[] solve(int[]arr,int[][]q){
        int n=arr.length;
        int[]ps=new int[n];
        ps[0]=arr[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        int[]ans=new int[q.length];
        for(int i=0;i<q.length;i++){
            int l=q[i][0];
            int r=q[i][1];
            if(l==0){
                ans[i]=ps[r];
            }else {
                ans[i]=ps[r]-ps[l-1];
            }
        }
        return ans;
    }

    // ************ BRUTE FORCE ************
    public static int[] bruteforce(int[] arr, int[][] q) {
        int[] ans = new int[q.length];

        for (int i = 0; i < q.length; i++) {
            int l = q[i][0];
            int r = q[i][1];
            int sum = 0;

            for (int j = l; j <= r; j++) {
                sum += arr[j];
            }
            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int[][] q = {{0,2}, {2,4}, {1,4}};

        int[] ans1 = solve(arr, q);
        int[] brute1 = bruteforce(arr, q);

        System.out.print("Prefix: ");
        for(int x : ans1) System.out.print(x + " ");

        System.out.print("\nBrute : ");
        for(int x : brute1) System.out.print(x + " ");
    }
}

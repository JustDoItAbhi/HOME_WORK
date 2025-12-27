package lld1.DSA.dsa1.subarrays;

public class printAllSubArrays {
    public static int[][] bruteFroce(int[]arr){
        int n=arr.length;
        int[][]ans=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    ans[i][j]=arr[k];
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }

        }
        return ans;
    }
//    public static void optimozed(int[]arr){
//        System.out.println("THERE CANNOT BE ANY IMPROVED VERSION OF PRINTING SUBARRAY , BECAUSE N(N+1)/2");
//
//    }

    public static void main(String[] args) {
        int[]stocksProfits = {1, 2, 3};
//        optimozed(stocksProfits);

       int[][]ans= bruteFroce(stocksProfits);
       int n=ans.length;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

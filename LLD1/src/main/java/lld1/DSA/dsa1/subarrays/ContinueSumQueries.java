package lld1.DSA.dsa1.subarrays;

public class ContinueSumQueries {
    public static int[] bruteFroce(int[]arr, int[][]q) {
        for (int i = 0; i < q.length; i++) {
            int s = q[i][0];
            int e = q[i][1];
            int val = q[i][2];
        for(int j=s;j<=e;j++){
            arr[j]+=val;
            if(e + 1 < arr.length){
                arr[e + 1] -= val;
            }
        }
        }
        return arr;
    }

    public static int[] improvize(int[]arr, int[][]q){
        int n=arr.length;
        for(int i=0;i<q.length;i++){
            int s=q[i][0];
            int e=q[i][1];
            int val=q[i][2];
            arr[s]+=val;
            if(e+1<n){
                arr[e+1]+=-val;
            }

        }
        System.out.println();
        for(int j=1;j<n;j++){
            arr[j]+=arr[j-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr = {0,0,0,0,0,0,0,0,0,0};
                 // 0 1 2 3 4 5 6 7 8 9
                 // 0 0 0 1 1 1 1 0 0 0
                 // 0 0 3 3 3 3 3 3 0 0
                 // 0 0 0 0 5 5 5 0 0 0
                 // 0-4-4-4-4-4 0 0 0 0
            // 0-4-1 0 5 5 9 3 0 0
        int[][] a={
                {3,6,1},
                {2,7,3},
                {4,6,5},
                {1,5,-4},};
        int[] ims=(improvize(arr,a));
        System.out.println("imrpove");
        for(int x:ims){
            System.out.print(" "+x+" ");
        }
//        int []ans=bruteFroce(arr,a);
//        System.out.println("brute");
//
//        for(int x:ans){
//            System.out.print(" "+x+" ");
//        }

        System.out.println("_______");
        int[]arr1 = {0,0,0,0,0,0};
                   //0 1 2 3 4
                  // 0 2 2 2
                  // 0 0 3 3 3 0
                 //  0 2 5 5 3
                 // 0  2 5 5 3 2
        int[][] b={
                {1,3,2},
                {2,4,3}};
        // 0 1,

//        System.out.println(improvisedApporch(arr1));
        System.out.println("imrpove");
        int[]im= (improvize(arr1,b));
        for(int x:im){
            System.out.print(" "+x+" ");
        }
        System.out.println("______________");
//        System.out.println("brute");
//        int []ans1=bruteFroce(arr1,b);
//        for(int x:ans1){
//            System.out.print(" "+x+" ");
//        }
    }
}

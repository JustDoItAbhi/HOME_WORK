package lld1.LLD1.dsa1.prefixsum;

public class PcCOUNT {
    public static int solve(int[]arr,int[][]q){
        int n=arr.length;
        int[]pc=new int[n];
        if(arr[0]%2==0){
            pc[0]=1;
        }else {
            pc[0]=0;
        }
        for(int i=1;i<n;i++){
            if(arr[i]%2==0){
                pc[i]++;

            }
        }
        int count=0;
        for(int i=0;i<q.length;i++){
            int l=q[i][0];
            int r=q[i][1];
            if(l==0){
                pc[i]=pc[r];
            }
            pc[i]=pc[r]-pc[l-1];
            System.out.print(pc[i]+" ");
           if(r==l){
               return i;
           }
        }
                return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,9,16,14,13,12};

        int[][] query = {
                {1,5},
                {2,6},
                {4,5},
                {4,4},
                {3,6}
        };

        System.out.println(solve(arr, query));

//        int[]ans=solve(arr, query);
//        for(int x:ans){
//            System.out.print(x+" ");
//        }

        System.out.println("\n---");

        int[] arr2 = {3,4,9,8,5};

        int[][] query2 = {
                {0,3},
                {2,4}
        };

        System.out.println(solve(arr2, query2));

//        int[]ans1=solve(arr2, query2);
//        for(int x:ans1){
//            System.out.print(x+" ");
//        }
    }
}

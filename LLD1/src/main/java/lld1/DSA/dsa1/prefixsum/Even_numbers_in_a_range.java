package lld1.DSA.dsa1.prefixsum;

public class Even_numbers_in_a_range {
    public static int[] solve(int[]arr, int[][]q){
        int n=arr.length;
        int[]pc=new int[n];
        if(arr[0]%2==0){
            pc[0]=1;
        }else {
            pc[0]=0;
        }
        for(int i=1;i<n;i++) {
            int temp=0;
         if(arr[i]%2==0){
             temp=1;
         }
         pc[i]=pc[i-1]+temp;
        }
        int[]ans=new int[q.length];
        for (int i=0;i<q.length;i++){
            int l=q[i][0];
            int r=q[i][1];
            if(l==0){
                ans[i]=pc[r];
            }else {
                ans[i]=pc[r]-pc[l-1];
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr3={1, 2, 3, 4, 5};
                 //0  1   2  3  4
        int [][]q3={{0,2},
                {2,4},
                {1,4}};
        int[]ans3=solve(arr3,q3);
        for(int x:ans3){
            System.out.print(" "+x+" ");
        }
        System.out.println();
        int[]arr2={2,1,8,3,9,6};//3
        int [][]q2={{0,3},{3,5},{1,3},{2,4}};
        int[]ans1= solve(arr2,q2);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }
        System.out.println();


        int[]arr={-7, 1, 5, 2, -4, 3, 0};// ans {0,2,2]
        int [][]q={{0,2},{2,4},{1,4},};
        int[]ans= solve(arr,q);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }
//        System.out.println(" brute "+bruteforce(arr));
        System.out.println();



    }
}

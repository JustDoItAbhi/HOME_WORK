package lld1.DSA.dsa1.prefixsum;

public class Sum_of_even_indices {
    //A = [1,2,3,4,5]
    //Query = [1,4]
    //
    //We consider original indices:
    //Index	Value
    //1	2
    //2	3
    //3	4
    //4	5
    //Now check i % 2 == 0:
    //1 % 2 = 1 → odd → skip
    //2 % 2 = 0 → even → include value 3
    //3 % 2 = 1 → odd → skip
    //4 % 2 = 0 → even → include value 5
    //Sum = 3 + 5 = 8 ✔
    public static int[] solve(int[]arr, int[][]q) {
        int n = arr.length;
        int[]pc=new int[n];
            pc[0]=arr[0];

        for(int i=1;i<n;i++){
            pc[i]=pc[i-1];
            if(i%2==0){
                pc[i]+=arr[i];
//                System.out.print(pc[i]+" pc ");
            }
        }
        System.out.println();
        int[]ans=new int[q.length];
        for(int i=0;i<q.length;i++){
            int l=q[i][0];
            int r=q[i][1];

            if(l==0){
                ans[i]=pc[r];
            }else {
                int lastEvenBeforeL =0;
                if(l % 2 == 0) {
                   lastEvenBeforeL= l - 2;

                } else {
                    lastEvenBeforeL= l- 1;
                }
                if(lastEvenBeforeL>=0) {
                    ans[i] = pc[r] - pc[lastEvenBeforeL];
                }else{
                    ans[i] = pc[r];
                }
            }
        }
return ans;
    }
    public static void main(String[] args) {
        int[]arr3={1, 2, 3, 4, 5};
                 //0  1   2  3  4
        int [][]q3={
                {0,2},
                {1,4}};
        int[]ans3=solve(arr3,q3);
        for(int x:ans3){
            System.out.print(" "+x+" ");
        }
        System.out.println();
        int[]arr2={2,1,8,3,9,6};//3
        int [][]q2={{0,3},{2,4}};
        int[]ans1= solve(arr2,q2);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }
        System.out.println();


        int[]arr={-7, 1, 5, 2, -4, 3, 0};// ans {-2.1,1]
        int [][]q={{0,2},{2,4},{1,4}};
        int[]ans= solve(arr,q);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }
//        System.out.println(" brute "+bruteforce(arr));
        System.out.println();


    }
}

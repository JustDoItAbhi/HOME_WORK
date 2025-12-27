package lld1.DSA.dsa1.prefixsum;

public class Sum_of_Odd_indices {
    public static int[] solve(int[]arr,int[][]q){
        int n=arr.length;
        int[]ps=new int[n];
        ps[0]=0;
        for (int i=1;i<n;i++){
            ps[i]=ps[i-1];
        if(i%2!=0){
                ps[i]+=arr[i];
            }
        }
        System.out.println();
        int[]ans=new int[q.length];
        for(int i=0;i< q.length;i++){
            int L=q[i][0];
            int R=q[i][1];
          if (L==0){
              ans[i]=ps[R];
          }else {
              int OddBeforeL=0;
              if(L%2!=0){
                  OddBeforeL=L-2;
              }else {
                  OddBeforeL=L-1;
              }
              if (OddBeforeL>=0){
                  ans[i]=ps[R]-ps[OddBeforeL];
              }else {
                  ans[i]=ps[R];
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
                {1,4}
        };
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


        int[]arr={-7, 1, 5, 2, -4, 3, 0};// ans {1,2,3]
        int [][]q={{0,2},{2,4},{1,4}};
        int[]ans= solve(arr,q);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }
//        System.out.println(" brute "+bruteforce(arr));
        System.out.println();

    }
}

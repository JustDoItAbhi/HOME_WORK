package lld1.DSA.dsa1.subarrays;

public class Continuous_Sum_Query {
    //There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot.
    // When the devotees come to the temple, they donate some amount of coins to these beggars.
    // Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.
    //Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the
    // final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
    //For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B
    public static int[] solve(int [] arr , int[][] q){
        int n=arr.length;
        for(int i=0;i<q.length;i++){
            int s=q[i][0]-1;
            int e=q[i][1]-1;
            int val=q[i][2];
                arr[s]+=val;//  addded  s numbers
                                    if((e+1)<n){
                                        arr[e+1]+=-val;
                                    }// added e numbers
        }
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }


    public static void main(String[] args) {
        int[]arr={0,0,0,0,0};
        int[][]devotess={
                {1,2,10},
                {2,3,20},
                {2,5,25},
        };
        int[]ans =solve(arr,devotess);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }
    }
}

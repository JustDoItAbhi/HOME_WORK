package lld1.LLD1.dsa1.prefixsum.prifix_real_world;

public class Total_Water_Consumption_Between_Two_Days {
    //3) Total Water Consumption Between Two Days (Easy–Medium)
    //Problem: Given water[i] = liters of water consumed per day, answer queries (L, R) → total water consumed.
    //Input:
    //water = [2, 4, 3, 5, 1]
    //queries = [(0, 2), (1, 3), (3, 4)]
    //Output:
    //[9, 12, 6]
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


    public static void main(String[] args) {
        int[]calories = {2, 4, 3, 5, 1};
        int[][]q={
                {0,2},
                {1,3},
                {3,4}
        };

        int[]ans=solve(calories,q);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }
        System.out.println();
//        int[]ans1=optamisedApproch(calories,q);
//        for(int x:ans1){
//            System.out.print(" "+x+" ");
//        }

    }
}

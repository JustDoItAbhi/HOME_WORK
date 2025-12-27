package lld1.DSA.dsa1.prefixsum.prifix_real_world;

public class Total_Calories_Burned {
    //2) Total Calories Burned Between Two Days (Easy)
    //calories[i] = calories burned on day i. You get queries:
    //(L, R) → return total calories from L to R.
    //Test Cases
    //calories = [100, 200, 300, 400], query=(1,3) → 900
    //query=(0,0) → 100 (single day)
    //query=(3,3) → 400 (last day)
    public static int[] solve(int[]arr,int[][]q){
        int n=arr.length;
        if(n<=0){
            return new int[0];
        }
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
        int[]calories = {100, 200, 300, 400};
        int[][]q={
                {1,3},
                {0,0},
                {3,3}
        };
        int[]ans=solve(calories,q);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }

    }
}

package lld1.DSA.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum_of_Columns_of_2D_Array {
    public static int[] solve(int a, int b, int[][]c){
            int sum=0;
            int sumr=0;

        for(int i=0;i<c.length;i++){
            sum+=c[i][0];
            sumr+=c[i][1];
        }

        return new int[]{sum,sumr};
    }
    public static ArrayList<Integer> solveBYlist(int a, int b, ArrayList<ArrayList<Integer>>C){
        int n=C.size();
        int[]colSum=new int[b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                colSum[j]+=C.get(i).get(j);
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int x:colSum){
            ans.add(x);
        }
        return ans;
    }





    public static void main(String[] args) {
        int a=3;
        int b=2;
        int[][]c={{4,1},{1,3},{6,2}};
        int[]ans=solve(a,b,c);
        for(int x:ans){
            System.out.print(" "+ x+" ");
        }
        System.out.println();
        int d=3;
        int e=2;
        ArrayList<ArrayList<Integer>> f = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(4, 1)),
                        new ArrayList<>(Arrays.asList(1, 3)),
                        new ArrayList<>(Arrays.asList(6, 2))
                )
        );


        ArrayList<Integer>ans1 =solveBYlist(d,e,f);
        for(int x:ans1){
            System.out.print(" "+ x+" ");
        }


    }
}

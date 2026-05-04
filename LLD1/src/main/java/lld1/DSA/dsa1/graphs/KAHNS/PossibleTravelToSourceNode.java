package lld1.DSA.dsa1.graphs.KAHNS;

import java.util.ArrayList;

public class PossibleTravelToSourceNode {
    private static class Pair{
        int v;
        int wt;

        private Pair(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
    }

    public static void solve(int[][]edges){
        int max=0;
        for(int[]e:edges){
            max=Math.max(e[0],e[1]);
        }
        int n=max+1;
        ArrayList<ArrayList<Pair>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
                int u=edges[i][0];
                int v=edges[i][1];
                int wt=edges[i][2];
                list.get(u).add(new Pair(v,wt));
//                list.get(v).add(u);
            }

        for(int i=0;i<n;i++){
            System.out.print(" i = "+ i);
//            ArrayList<Pair>list1=list.get(i);
            for(Pair nbr:list.get(i)){
                System.out.print(" "+nbr.v + " "+nbr.wt);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

//        solve(graph);


        int[][]edges={
                {0,3,10},
                {0,1,5},
                {2,3,9},
                {3,4,3},
                {1,2,4},
                {4,5,7},
                {4,6,10},
                {5,6,5}
        };
        solve(edges);

    }
}

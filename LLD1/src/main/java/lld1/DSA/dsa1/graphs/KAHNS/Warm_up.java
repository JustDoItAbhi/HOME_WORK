package lld1.DSA.dsa1.graphs.KAHNS;

import java.util.ArrayList;
import java.util.Arrays;

public class Warm_up {
    public static void solve(ArrayList<ArrayList<Integer>> graph){
        int vtx=graph.size()+1;

        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<vtx;i++){
            list.add(new ArrayList<>());
        }
            for (ArrayList<Integer> egds : graph) {
                int u = egds.get(0)-1 ;
                int v = egds.get(1)-1 ;
                list.get(u).add(v);
        }
        int[]indegree=new int[vtx];
            for(int i=0;i<vtx;i++){
               for(int nbr:list.get(i)){
                   indegree[nbr]++;
            }
        }
        System.out.print("Indegrees:");
        for(int val : indegree){
            System.out.print(" " + val);
        }
        System.out.println(); // Add newline
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>>graph=new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,2)),
                new ArrayList<>(Arrays.asList(2,3))
        ));
        solve(graph);
        System.out.println("__________________");
        ArrayList<ArrayList<Integer>>graph2=new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,3)),
                new ArrayList<>(Arrays.asList(2,3))
        ));
        solve(graph);
    }
}

package lld1.DSA.dsa1.graphs.KAHNS;

import java.util.ArrayList;
import java.util.Arrays;

public class Level2 {
    public static void solve(ArrayList<ArrayList<Integer>>graph){
        int n=graph.size();
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(ArrayList<Integer>edges:graph){
            int u=edges.get(0)-1;
            int v=edges.get(1)-1;
            list.get(u).add(v);
        }

        int[]indegree=new int[n];
        for(int i=0;i<n;i++){
            for(int nbr:list.get(i)){
                indegree[nbr]++;
            }
        }
        System.out.print("indereee");
        for(int val:indegree){
            System.out.print(" "+val);
        }

    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,2)),
                new ArrayList<>(Arrays.asList(1,3)),
                new ArrayList<>(Arrays.asList(2,4)),
                new ArrayList<>(Arrays.asList(3,4))
        ));
        solve(graph);

    }
}

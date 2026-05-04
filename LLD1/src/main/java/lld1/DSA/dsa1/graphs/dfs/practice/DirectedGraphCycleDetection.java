package lld1.DSA.dsa1.graphs.dfs.practice;

import java.util.ArrayList;

public class DirectedGraphCycleDetection {
    public static boolean solve(int[][]edges){
        int max=0;
        for(int[]e:edges){
            max=Math.max(max,Math.max(e[0],e[1]));
        }
        int n=max+1;
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i< edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            graph.get(u).add(v);
        }
        boolean[]visit=new boolean[graph.size()];
        boolean[]previsited=new boolean[graph.size()];
        for (int i=0;i<graph.size();i++){
            if(visit[i]==false){
                if(dfs(graph,i, visit, previsited)){
                return true;
                }
            }
        }
    return false;
    }
    public static  boolean dfs(ArrayList<ArrayList<Integer>>graph, int node, boolean[]vist, boolean[]prvisit){
        vist[node]=true;
        prvisit[node]=true;
        for(int nbr:graph.get(node)){
            if(vist[nbr]==false){
                if(dfs(graph, nbr, vist, prvisit)){
                    return true;
                }
            } else if (prvisit[nbr]==true) {
                return true;
            }
        }
        prvisit[node]=false;
        return false;
    }
    public static void main(String[] args) {
        int[][]edges={
                {0,1},
                {1,2},
                {2,3},
                {3,1}
        };
//        solve(edges);
        System.out.println(solve(edges));
        System.out.println("_______________________");
        int[][]edges2={
                {0,1},
                {1,2},
                {2,3}
        };
//        solve(edges2);
        System.out.println(solve(edges2));// false
    }
}

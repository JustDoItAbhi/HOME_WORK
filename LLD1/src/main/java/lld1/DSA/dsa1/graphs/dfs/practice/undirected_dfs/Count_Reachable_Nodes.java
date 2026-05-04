package lld1.DSA.dsa1.graphs.dfs.practice.undirected_dfs;

import java.util.ArrayList;

public class Count_Reachable_Nodes {
    public static int solve(int[][]edges, int src) {
        int max = 0;
        for (int[] e : edges) {
            max = Math.max(max, Math.max(e[0], e[1]));
        }
        int n = max + 1;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[]visited=new boolean[graph.size()];
        int count=dfe(graph,src,visited);
        return count;
    }
    public static int dfe(ArrayList<ArrayList<Integer>>graph, int node, boolean[]visit){
        visit[node]=true;
        int val=1;
        for(int nbr:graph.get(node)){
            if(!visit[nbr]){
           val+= dfe(graph, nbr, visit);
            }
            }
        return val;
    }
    public static void main(String[] args) {
        int[][]edges={
            {0,1},
            {0,2},
            {1,3},
            {4,5}
        };
        int src=0;
        System.out.println(solve(edges,src));
    }
}

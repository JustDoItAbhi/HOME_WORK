package lld1.DSA.dsa1.graphs.dfs.practice.undirected_dfs;

import java.util.ArrayList;

public class Print_DFS_Traversal {
    public static void solve(int[][]edges){
        int max=0;
        for(int[]e:edges){
            max=Math.max(max,Math.max(e[0],e[1]));
        }
        int n=max+1;
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[]visit=new boolean[graph.size()];
                    dfs(graph,0,visit);
        }

    public static void dfs(ArrayList<ArrayList<Integer>>graph, int src, boolean[]visit){
        visit[src]=true;
        System.out.print(src+" ");
        for(int nbr:graph.get(src)){
            if(visit[nbr]==false){
                dfs(graph, nbr, visit);
            }
        }
    }
    public static void main(String[] args) {
        int[][]edges = {
                {0,1},
                {0,2},
                {1,3},
                {2,4}
        };
        solve(edges);
    }
}

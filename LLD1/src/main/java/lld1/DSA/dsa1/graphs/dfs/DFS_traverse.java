package lld1.DSA.dsa1.graphs.dfs;

import java.util.ArrayList;

public class DFS_traverse {
    public static void solve(int[][]edges, int src){
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
        boolean[]visited=new boolean[graph.size()];
        visited[0]=true;
        dfs(graph,src,visited);

    }
    public static void dfs(ArrayList<ArrayList<Integer>>graph,int start, boolean[]visit){
        System.out.print(start+" ");
    ArrayList<Integer>list=graph.get(start);
    for(int nbr:list){
        if(visit[nbr]==false){
            visit[nbr]=true;
            dfs(graph, nbr, visit);
        }
    }


    }



    public static void main(String[] args) {
        int V = 3;
        int[][] edges = {
                {0,1},
                {0,2},
                {1,3},
                {2,4}
        };
        solve(edges,0);
    }
}

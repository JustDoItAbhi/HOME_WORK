package lld1.DSA.dsa1.graphs.dfs;

import java.util.ArrayList;

public class CountOFComponenetrs {
    public static int solve(int[][]edges){
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
        boolean[]vist=new boolean[graph.size()];
        int count=0;
        for(int i=0;i<graph.size();i++){
            if (vist[i]==false){
                count++;
                vist[i]=true;
                dfs(graph,i,vist);
            }
        }
        return count;
    }
    public static void dfs(ArrayList<ArrayList<Integer>>graph, int src, boolean[]vis){
        for(int nbr:graph.get(src)){
            if(vis[nbr]==false){
                vis[nbr]=true;
                dfs(graph, nbr, vis);
            }
        }
    }




    public static void main(String[] args) {
        int[][] edges = {
                {0,1},
                {0,2},
                {1,3},
                {2,4},
                {5,6},
                {6,7},
                {8,9},
                {10,14}
        };
     int ans=   solve(edges);

        System.out.println(ans);
    }
}

package lld1.DSA.dsa1.graphs.dfs.practice.undirected_dfs;

import java.util.ArrayList;

public class DetectCycleInUndirectedGraph {
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
            graph.get(v).add(u);
        }
        boolean[]visit=new boolean[graph.size()];
        for(int i=0;i<graph.size();i++){
            if(!visit[i]){
                if(dfs(graph,i,visit,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(ArrayList<ArrayList<Integer>>graph, int node , boolean[]visit, int distination){
        visit[node]=true;
        for(int nbr:graph.get(node)) {
            if (visit[nbr] == false) {
                if(dfs(graph, nbr, visit,node)){
                    return true;
                }
            }else if(nbr!=distination){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][]edges={
                {0,1},
                {1,2},
                {2,3},
                {3,0}
        };
        System.out.println(solve(edges));

        int[][]edges2={
                {0,1},
                {1,2},
                {2,3},
                {3,4}
        };
        System.out.println(solve(edges2));

    }
}

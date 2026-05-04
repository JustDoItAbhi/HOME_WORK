package lld1.DSA.dsa1.graphs.dfs.practice.undirected_dfs;

import java.util.ArrayList;

public class Check_Path_Exists {
    public static boolean solve(int[][]edges, int src,int dest){
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
        int count=0;
        boolean[]visit=new boolean[graph.size()];

        if(dfs(graph,src, visit,dest)){
            return true;
        }
        return false;
    }
    public static boolean dfs(ArrayList<ArrayList<Integer>>graph, int src, boolean[]visit, int dest){
        if(src==dest){
            return true;
        }
        visit[src]=true;
        for(int nbr:graph.get(src)){
            if(visit[nbr]==false ){
                if(dfs(graph, nbr, visit,dest)){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][]edges = {
                {0,1},
                {1,2},
                {2,3},
                {4,5}
        };
        int dest=3;
        int src=0;
       boolean ans= solve(edges,src,dest);
        System.out.println(ans);

        int[][]edges1 = {
                {0,1},
                {1,2},
                {2,3},
                {4,5}
        };
        int desti=5;
        int src1=0;
        boolean ans1= solve(edges1,src1,desti);
        System.out.println(ans1);
    }
}

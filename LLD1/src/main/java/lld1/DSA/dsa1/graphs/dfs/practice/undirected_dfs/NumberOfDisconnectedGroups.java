package lld1.DSA.dsa1.graphs.dfs.practice.undirected_dfs;

import java.util.ArrayList;

public class NumberOfDisconnectedGroups {
    public static void solve(int[][]edges){
        int max=0;
        for(int[]e:edges){
            max=Math.max(max,Math.max(e[0],e[1]));
        }
        int n=max+1;
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int ans=0;
        boolean[]visited=new boolean[graph.size()];
        for(int i=0;i<graph.size();i++){
                if(visited[i]==false){
                int size=  dfs(graph,i,visited);
                    System.out.println("size "+size);
                    ans++;
                }
            }
        System.out.println(ans);
    }

    public static int dfs(ArrayList<ArrayList<Integer>>graph, int src, boolean[]visit){

        int count=1;
        for(int nbr:graph.get(src)){
            if(visit[nbr]==false){
                visit[src]=true;
                count+=dfs(graph, nbr, visit);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][]a={
                {0,1},
                {2,3}
        };
        solve(a);
        System.out.println();
    }
}

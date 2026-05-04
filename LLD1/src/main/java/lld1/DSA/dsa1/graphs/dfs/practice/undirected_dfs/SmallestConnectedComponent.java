package lld1.DSA.dsa1.graphs.dfs.practice.undirected_dfs;

import java.util.ArrayList;

public class SmallestConnectedComponent {
    public static void solve(int[][]edges) {
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
        boolean[]visit=new boolean[graph.size()];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i< graph.size();i++){
            if(visit[i]==false){
          int size = dfs(graph,i,visit);
                ans=Math.min(ans,size);
            }
        }

        System.out.println(" ANSWER OF MIN CONNECTED COMPONENETS "+ans);
    }
    public static int dfs(ArrayList<ArrayList<Integer>>graph, int node, boolean[]visit){

        int count=1;
        visit[node]=true;
    for(int nbr:graph.get(node)){
        if(visit[nbr]==false){
           count+= dfs(graph, nbr, visit);
        }
    }

return count;

    }
    public static void main(String[] args) {

            int[][]a={
                    {0,1},
                    {1,2},
                    {3,4}
            };
            solve(a);
        }

}

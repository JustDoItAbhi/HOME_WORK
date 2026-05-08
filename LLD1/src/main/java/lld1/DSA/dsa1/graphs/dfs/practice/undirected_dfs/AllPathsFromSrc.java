package lld1.DSA.dsa1.graphs.dfs.practice.undirected_dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AllPathsFromSrc {
public static void solve(int[][]endges,int src, int dist){
    int max=0;
    for(int[]e:endges){
        max=Math.max(max,Math.max(e[0],e[1]));
    }
    int n=max+1;
    ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
    for(int i=0;i<n;i++){
        graph.add(new ArrayList<>());
    }
    for(int i=0;i<endges.length;i++){
        int u=endges[i][0];
        int v=endges[i][1];
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    boolean[]visit=new boolean[graph.size()];
    ArrayList<Integer>path=new ArrayList<>();
    dfs(graph,src,dist,visit,path);
}
    public static void bfs(ArrayList<ArrayList<Integer>> graph, int src, int dest) {

        Queue<List<Integer>> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];

        List<Integer> startPath = new ArrayList<>();
        startPath.add(src);

        queue.add(startPath);
        visited[src] = true;

        while (!queue.isEmpty()) {
            List<Integer> path = queue.poll();
            int last = path.get(path.size() - 1);

            if (last == dest) {
                System.out.println("Shortest Path: " + path);
                return;
            }

            for (int nbr : graph.get(last)) {
                if (!visited[nbr]) {
                    visited[nbr] = true;

                    List<Integer> newPath = new ArrayList<>(path);
                    newPath.add(nbr);

                    queue.add(newPath);
                }
            }
        }
    }
public static void dfs(ArrayList<ArrayList<Integer>>graph, int src, int dist, boolean[]visit,ArrayList<Integer>path){
 visit[src]=true;
   path.add(src);
    if(src==dist){
        System.out.println(path+" ");
   }else {
        for(int nbr:graph.get(src)){
            if (visit[nbr]==false){
                dfs(graph, nbr, dist, visit, path);
            }
        }
    }
    path.remove(path.size()-1);
    visit[src]=false;
}

    public static void main(String[] args) {
        int[][]edges={
                {0,1},
                {1,2},
                {2,3},
                {3,1}
        };
        int src=0;
        int dest=3;
        solve(edges,src,dest);
        System.out.println();
        int[][]edges1={
                {0,1},
                {0,2},
                {1,3},
                {2,4},
                {3,4},
                {3,5},
                {4,5},
                {5,6}
        };
        int i=0;
        int end=5;
        solve(edges1,i,end);
    }
}

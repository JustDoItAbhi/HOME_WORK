package lld1.DSA.dsa1.graphs.bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;

import java.util.Queue;

public class BFS {
    public static void solve(int[][]edges, int src , int dest){

        int max = 0;
        for (int[] e : edges) {
            max = Math.max(max, Math.max(e[0], e[1]));
        }
        int n = max + 1;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for(int i=0;i< edges.length;i++){
            System.out.print(" i = "+ i);
            for(int nbr:graph.get(i)){
                System.out.print(" "+nbr + " ");
            }
            System.out.println();
        }

        Queue<Integer>q=new ArrayDeque<>();
        q.add(src);
        int count=0;
        boolean[]visting=new boolean[graph.size()];
        visting[src]=true;
        while (!q.isEmpty()){
            int rmv=q.remove();
            System.out.println(" count  "+ count);
            for(int nbr:graph.get(rmv)){
                if(!visting[nbr]){
                    q.add(nbr);
                    count+=nbr;
                    visting[nbr]=true;
                }

            }
        }
    }
    public static void main(String[] args) {

        int[][]edges={
                {0,3},
                {0,1},
                {2,3},
                {3,4},
                {1,2},
                {4,5},
                {4,6},
                {5,6}
        };
        int src=5;
        int destination =9;
        solve(edges,src,destination);
    }
}

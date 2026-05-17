package lld1.DSA.dsa1.graphs.bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class CyceDetactionOFDirectedGraph {
    /*
    Problem Description

Given an undirected graph having A nodes labelled from 1 to A with M edges given in a form of matrix B of size M x 2 where (B[i][0], B[i][1]) represents two nodes B[i][0] and B[i][1] connected by an edge.

Find whether the graph contains a cycle or not, return 1 if cycle is present else return 0.

NOTE:

The cycle must contain atleast three nodes.
There are no self-loops in the graph.
There are no multiple edges between two nodes.
The graph may or may not be connected.
Nodes are numbered from 1 to A.
Your solution will run on multiple test cases. If you are using global variables make sure to clear them.
     */


    public static int solve( int[][] edges,int x) {
        int n = x + 1;
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
        int vtx=graph.size();
        int[]indegree=new int[vtx];
        for(int i=0;i<vtx;i++){
            for(int nbr:graph.get(i)){
                indegree[nbr]++;
            }
        }
        Queue<Integer>q=new ArrayDeque<>();
        for(int i=0;i<vtx;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while (q.size()>0){
            int rmv=q.remove();
            count++;
            for(int nbr:graph.get(rmv)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.add(nbr);
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[][] a = {
                {1,2},
                {1,3},
                {2,3},
                {1,4},
                {4,5},
        };
        int x=5;
        System.out.println("ans one "+ solve(a,x));

        int[][] b = {
                {1,2},
                {1,3}
        };
        int y=3;
        System.out.println("ans "+solve(b,y));
    }
}

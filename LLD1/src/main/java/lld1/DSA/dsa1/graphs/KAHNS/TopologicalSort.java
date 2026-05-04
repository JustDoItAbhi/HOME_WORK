package lld1.DSA.dsa1.graphs.KAHNS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class TopologicalSort {
    /*
    Problem Description

Given an directed acyclic graph having A nodes. A matrix B of size M x 2 is given which represents the M edges such that there is
a edge directed from node B[i][0] to node B[i][1].Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of
vertices such that for every directed edge uv, vertex u comes before v in the ordering. Topological
 Sorting for a graph is not possible if the graph is not a DAG.
Return the topological ordering of the graph and if it doesn't exist then return an empty array.
If there is a solution return the correct ordering. If there are multiple solutions print the lexographically smallest one.
Ordering (a, b, c) is said to be lexographically smaller than ordering (e, f, g) if a < e or if(a==e) then b < f and so on.
NOTE:
There are no self-loops in the graph.
The graph may or may not be connected.
Nodes are numbered from 1 to A.
Your solution will run on multiple test cases. If you are using global variables make sure to clear them.
Input Format

The first argument given is an integer A representing the number of nodes in the graph.

The second argument given a matrix B of size M x 2 which represents the M edges such that there is a edge directed from node B[i][0] to node B[i][1].
Output Format
Return a one-dimensional array denoting the topological ordering of the graph and it it doesn't exist then return empty array.
     */

    public static void solve(int x,ArrayList<ArrayList<Integer>>edges){
        int vtx= x+1;
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<x;i++){
            graph.add(new ArrayList<>());
            }

        for(ArrayList<Integer>edgs:edges){
            int u=edgs.get(0)-1;
            int v=edgs.get(1)-1;
            graph.get(u).add(v);
        }
        int[]indegree=new int[x];

        for(int u=0;u<x;u++){
            for(int nbr:graph.get(u)){
                indegree[nbr]++;
            }
        }

        for(int i=0;i<x;i++){
            System.out.print("  ->  = "+indegree[i]);
        }

        Queue<Integer>q=new ArrayDeque<>();
        for(int i=0;i<x;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        System.out.println();
        for(int i=0;i<x;i++){
            System.out.print("  ->  = "+q);
        }

        System.out.println();

        ArrayList<Integer> topo = new ArrayList<>();
        while (q.size()>0){
            int rem=q.remove();
            topo.add(rem+1);
//            System.out.print(" -> "+rem);
            for(int nbr:graph.get(rem)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.add(nbr);
                }
            }
            System.out.println();
            for(int i=0;i<x;i++){
                System.out.print("  ->  = "+q);
            }
            for(int i=0;i<topo.size();i++){
//                System.out.print(" " +topo.get(+i));
                    if(i!=topo.size()-1){
//                        System.out.print(" -> ");
                    }
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>list= new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(6,3)),
                new ArrayList<>(Arrays.asList(6,1)),
                new ArrayList<>(Arrays.asList(5,1)),
                new ArrayList<>(Arrays.asList(5,2)),
                new ArrayList<>(Arrays.asList(3,4)),
                new ArrayList<>(Arrays.asList(4,2))
        ));

        int x=6;
        solve(x,list);

        System.out.println();

        ArrayList<ArrayList<Integer>>list3= new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,2)),
                new ArrayList<>(Arrays.asList(2,3)),
                new ArrayList<>(Arrays.asList(3,1))));

        int y=3;
//       solve(y,list3);
//
//        int []val2=sove(y,arr2);
//        for(int ans:val2){
//            System.out.print(" second "+ ans);
//        }
    }

}

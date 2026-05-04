package lld1.DSA.dsa1.graphs.bfs;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottanOrange {
    public static class Oranges{
        int i;
        int j;
        int t;

        public Oranges(int i, int j, int t) {
            this.i = i;
            this.j = j;
            this.t = t;
        }
    }

    public static int solve(int[][]grid){
        int n= grid.length;;
        int m=grid[0].length;
        Queue<Oranges>q=new ArrayDeque<>();
        int fresh=0;
        // add to queue first roton oranges
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Oranges(i, j, 0));
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
            // bfs
        int ans=0;
            while (q.size()>0){

                Oranges rem=q.remove();
                int i= rem.i;
                int j= rem.j;
                int t= rem.t;
                // update ans variable
                ans=t;
                // check top 1-1,j
                if(i-1>=0 && grid[i-1][j]==1){
                    grid[i-1][j]=2;
                    fresh--;
                    q.add(new Oranges(i-1,j,t+1));
                }
                // check 1+1,j if less then n
                if(i+1<n && grid[i+1][j]==1){
                    grid[i+1][j]=2;
                    fresh--;
                    q.add(new Oranges(i+1,j,t+1));
                }
                if(j-1>=0 && grid[i][j-1]==1){
                    grid[i][j-1]=2;
                    fresh--;
                    q.add(new Oranges(i,j-1,t+1));
                }
                if(j+1<m && grid[i][j+1]==1){
                    grid[i][j+1]=2;
                    fresh--;
                    q.add(new Oranges(i,j+1,t+1));
                }
            }

        if(fresh==0){
            return ans;
        }else {
            return -1;
        }

    }



    public static void main(String[] args) {
      int[][]grid = {
        {2,1,1},
              {1,1,0},
                {0,1,1},
                };
   int ans=   solve(grid);
        System.out.println(" ANS1  "+ans);

        int[][]grid1 = { {2,1,1}, {0,1,1}, {1,0,1},};
        int ans1=   solve(grid1);
        System.out.println(" ANS2  "+ans1);
        int[][]grid2 = {{2,1,1}, {1,2,1}, {1,1,1},};
        int ans2=   solve(grid2);
        System.out.println(" ANS3  "+ans2);

        int[][]grid3 = {{0,2}
        };
        int ans3=   solve(grid3);
        System.out.println(" ANS3  "+ans3);
        int[][]grid4 = {{1,1,1}, {1,1,1}, {1,1,1},};
        int ans4=   solve(grid4);
        System.out.println(" ANS4  "+ans4);

        int[][]grid5 = {
                {2,1,0,2},
                {1,1,1,0},
                {0,1,1,1},
                {2,0,1,1}
        };
        int ans5=   solve(grid5);
        System.out.println(" ANS5  "+ans5);
    }
}

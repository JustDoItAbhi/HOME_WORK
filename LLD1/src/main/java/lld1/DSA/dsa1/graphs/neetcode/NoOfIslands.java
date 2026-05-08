package lld1.DSA.dsa1.graphs.neetcode;

public class NoOfIslands {
    public static void dfs(char[][]grid, int i, int j, boolean[][]visit, boolean[][]prev ){
        visit[i][j]=true;
        if(i-1>=0 && grid[i-1][j]=='1' && visit[i-1][j]==false){
           dfs(grid,i-1,j,visit,prev);
        }
        if(j-1>=0 && grid[i][j-1]=='1' && visit[i][j-1]==false){
            dfs(grid,i,j-1,visit,prev);
        }
        if(i+1< grid.length && grid[i+1][j]=='1' && visit[i+1][j]==false){
            dfs(grid,i+1,j,visit,prev);
        }
        if(j+1<grid[0].length && grid[i][j+1]=='1' && visit[i][j+1]==false){
            dfs(grid,i,j+1,visit,prev);
        }

    }
    public static int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][]visited=new boolean[n][m];
        boolean[][]previsit=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==false && grid[i][j]=='1'){
                 dfs(grid,i,j,visited,previsit);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
       char[][] grid = {
               {'0','1','1','1','0'},
               {'0','1','0','1','0'},
               {'1','1','0','0','0'},
               {'0','0','0','0','0'}
        };
        System.out.println( numIslands(grid));
    }
}

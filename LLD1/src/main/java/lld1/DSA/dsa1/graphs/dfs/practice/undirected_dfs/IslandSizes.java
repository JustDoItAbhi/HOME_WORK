package lld1.DSA.dsa1.graphs.dfs.practice.undirected_dfs;

public class IslandSizes {
    public static void solve(int[][]matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[][]visit=new boolean[n][m];
        for(int i=0;i<n;i++){
         for (int j=0;j<m;j++){
             if(matrix[i][j]==1 && visit[i][j]==false){
               int ans=  dfs(matrix,i,j,visit);
                 System.out.println("ans "+ans);
             }
         }
        }
    }
    public static int dfs(int[][]matrix, int i,int j,boolean[][]visit){
        visit[i][j]=true;
        int count=1;

     if(i-1>=0 && matrix[i-1][j]==1 && !visit[i-1][j]){
        count+= dfs(matrix, i-1, j,visit);
     }
        if(j-1>=0 && matrix[i][j-1]==1 && !visit[i][j-1]){
            count+=dfs(matrix, i, j-1,visit);
        }
        if(i+1< matrix.length && matrix[i+1][j]==1 && !visit[i+1][j]){
            count+=dfs(matrix, i+1, j,visit);
        }
        if(j+1<matrix[0].length && matrix[i][j+1]==1 && !visit[i][j+1]){
            count+=dfs(matrix, i, j+1,visit);
        }
return count;
    }
    public static void main(String[] args) {
        int[][]proviences={
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };
        solve(proviences);
    }
}

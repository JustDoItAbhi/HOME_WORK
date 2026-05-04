package lld1.DSA.dsa1.graphs.dfs.practice.undirected_dfs;

public class NumberOfProvinces {
    public static  void solve(int[][]prov){
        int n=prov.length;
        boolean[]vistt=new boolean[n];
        int provinces=0;
        for(int i=0;i<n;i++){
            if(vistt[i]==false){
                dfs(prov,i,vistt);
                provinces++;
            }
        }
        System.out.print(provinces);

    }
public static void dfs(int[][]matrix, int node, boolean[]vist){
        vist[node]=true;
        for(int i=0;i<matrix.length;i++){
            if(matrix[node][i]==1 && vist[i]==false){
                dfs(matrix, i, vist);
            }
        }
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

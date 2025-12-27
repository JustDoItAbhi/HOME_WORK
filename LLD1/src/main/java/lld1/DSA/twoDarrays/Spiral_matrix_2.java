package lld1.DSA.twoDarrays;

public class Spiral_matrix_2 {
    //Given an integer matrix A of size NxN. Print the matrix in spiral form starting from A[0][0] in the first row.
    //For example : Given matrix of 2x2
    //1 2
    //3 4
    //You should print => 1 2 4 3
    public static int[] solve(int[][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int[]ans=new int[n*m];
        int idx=0;
      int top=0,bottom=n-1;
      int left=0,right=m-1;
        while (top <= bottom && left <= right) {

            // left → right (top row)
            for (int j = left; j <= right; j++) {
                ans[idx++] = arr[top][j];
            }
            top++;

            // top → bottom (right column)
            for (int i = top; i <= bottom; i++) {
                ans[idx++] = arr[i][right];
            }
            right--;

            // right → left (bottom row)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans[idx++] = arr[bottom][j];
                }
                bottom--;
            }

            // bottom → top (left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[idx++] = arr[i][left];
                }
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][]arr={{5,2},{6,8}};
        int[]ans=solve(arr);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }
        System.out.println();
        int[][]arr1={{8,2,5},{2,9,6},{5,8,7}};
        int[]ans1=solve(arr1);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }
    }
}

package lld1.DSA.dsa1.prefixsum;

public class Product_ArrayPuzzle {
    public static int[] solve(int [] arr){
        int n=arr.length;

        int[]ps=new int[n];

        ps[0]=1;
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]*arr[i-1];
        }

        int [] sufix=new int[n];
        sufix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            sufix[i]=sufix[i+1]* arr[i+1];
        }

        for(int i=0;i<n;i++){
            System.out.println("➡️ ps "+ps[i]+" ➡️ sufic "+sufix[i]);
        }

        int[]ans=new int[n];
        
        for(int i=0;i<n;i++){
            ans[i]=sufix[i]*ps[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]prefix=solve(arr);
        for(int x:prefix){
            System.out.print(" "+ x+" ");
        }
        System.out.println();
        int[]arr1={5, 1, 10, 1};
        int[]prefix1=solve(arr1);
        for(int x:prefix1){
            System.out.print(" "+ x+" ");
        }
    }
}

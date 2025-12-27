package lld1.DSA.oneDarrays;

public class Remove_i {
    //Write a program to input N numbers array, A from the user and an integer X and print the array by deleting element at specified position X.
    //
    //Note:
    //In this problem, positions are 1-based (the first element is at position 1).
    //But in most programming languages, arrays/lists are 0-based (the first element is at index 0).
    //
    //So if the position given is X, you should access it using index X - 1.
    public static int[] solve(int[]arr,int x){
        int n=arr.length;
        int[]ans=new int[n-1];
        int removeIndex=x-1;
        int idx=0;
        for(int i=0;i<n;i++){
           if(i!=removeIndex){
               ans[idx++]=arr[i];
           }
            System.out.print(ans[i]+" ");
        }

        return ans;
    }
    public static void main(String[] args) {

        int[]arr={2 ,3 ,1, 4, 2};
            int a=3;
        int[]ans= solve(arr,a);
        for(int y:ans){
            System.out.print(y+" ");
        }
        System.out.println("_____________");
        int[]arr1={ 4,5};
        int x=2;
        int[]ans1= solve(arr1,x);
        for(int y:ans1){
            System.out.print(y+" ");
        }
    }
}

package lld1.DSA.dsa1.subarrays;

public class Suffix_maximum {
    public static int[] solve(int[]arr){
        int n=arr.length;
        int[]sufix=new int[n];
        sufix[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            sufix[i]=Math.max(sufix[i+1],arr[i]);
        }
        return sufix;
    }
    public static void main(String[] args) {
        int[]arr={12, 5, 6, 7};//12, 7, 7, 7
        int[]ans =solve(arr);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }
        System.out.println();
        int[]arr1={15, 9, 7, 11, 10};//[15, 11, 11, 11, 10]
        int[]ans1 =solve(arr1);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }

    }
}

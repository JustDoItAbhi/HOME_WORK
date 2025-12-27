package lld1.DSA.dsa1.subarrays;

public class Prefix_maximum {
    //Kamal is a software developer and he's working on a new feature for an e-commerce website.
    // The website has a list of prices for different products, and Kamal needs to find the maximum price of all products up to a given index.
    //
    //He has the list of prices in an array A of length N, and he needs to write a program that will
    // return the maximum price occurring in the subarray from 0 to i for every index i. Kamal needs your help to implement this function.

    public static int[] solve(int[]arr){
        int n=arr.length;
        int[]ps=new int[n];


        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
//            arr[i]=Math.max(arr[i-1],arr[i]);
            if(arr[i]>max){
                max=arr[i];
            }
            ps[i]=max;
        }
        return ps;
    }

    public static void main(String[] args) {
        int[]arr={9, 7, 6, 18, 2};//[9, 9, 9, 18, 18]
        int[]ans =solve(arr);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }
        System.out.println();
        int[]arr1={16, 8, 24, 9, 25, 17};//[16, 16, 24, 24, 25, 25]
        int[]ans1 =solve(arr1);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }
    }
}

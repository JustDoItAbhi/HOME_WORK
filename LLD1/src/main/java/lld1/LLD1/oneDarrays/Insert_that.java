package lld1.LLD1.oneDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_that {
    public  static  int[] solve(int[] arr,int val, int x){
        int n=arr.length;
        int[] ans = new int[n + 1];

   for(int i=0;i<x;i++){
       ans[i]=arr[i];
   }
   ans[x]=val;
   for(int i=x+1;i<=ans.length-1;i++){
       ans[i]=arr[i-1];
       System.out.println(arr[i-1]+" "+ans[i]);
   }

        return ans;
    }
//0 1 2 3 4
//2 3 1 4 2
    // i=3 value =5

    public static void main(String[] args) {
//        Scanner scn =new Scanner(System.in);
//        System.out.print("ENTER N VALUE");
//        int n=scn.nextInt();
//        System.out.println("enter m value");
//        int m=scn.nextInt();
//        System.out.println("enter x value");
//        int x=scn.nextInt();
//        int[]arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=scn.nextInt();
//
//        }
        int[] arr={2, 3, 1, 4, 2};
        int m=5;
        int x=3;
        int n=arr.length;
        int[]ans=solve(arr,m,x);
        System.out.println();
       for(int i=0;i<ans.length;i++){
           System.out.print(ans[i]+" ");
       }

    }
}

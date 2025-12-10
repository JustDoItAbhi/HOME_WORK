package lld1.LLD1.oneDarrays;

import java.util.List;

public class Negative_Integers {
    //        Write a program to print all negative numbers from input array A of size N. Take integer N and N elements of the array as input from user.
    public static int[] solve(int[]arr){
    int n=arr.length;
        int count=0;
    for(int i=0;i<n;i++){
        if(arr[i]<0){
            count++;
//            System.out.print(arr[i]+" ");
        }
        }
        int[]ans=new int[count];
    int idex=0;
        for(int j=0;j<n;j++){
            if(arr[j]<0){
                ans[idex]=arr[j];
                idex++;
            }
        }

    return ans;
    }

    public static void main(String[] args) {
        int[]arr={5, 1, -5, 2, -8, -4};
        int[]x=solve(arr);
        for(int ans:x){
            System.out.print(ans+" ");
        }
        System.out.printf("---------");
        int[]arr1={4, -1, 0 ,-8, -1};
        int[]y=solve(arr1);
        for(int ans:y){
            System.out.print(ans+" ");
        }
    }
}

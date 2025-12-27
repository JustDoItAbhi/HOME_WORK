package lld1.DSA.twoDarrays;

import java.util.Scanner;

public class Row_Sum {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("ENTER N VALUE");
        int n= scn.nextInt();
        System.out.println("ENTER M VALUE");
        int m=scn.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+" ");
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
//                System.out.print(sum+" ");
                ans[i]=sum;
            }
            System.out.println();
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }

    }
}

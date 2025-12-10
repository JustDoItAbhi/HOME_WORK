package lld1.LLD1.twoDarrays;

import java.util.Scanner;

public class twoDmatrix {
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
//                System.out.println(arr[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

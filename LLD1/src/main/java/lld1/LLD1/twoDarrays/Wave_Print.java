package lld1.LLD1.twoDarrays;

import java.util.Scanner;

public class Wave_Print {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER N VALUE");
        int n = scn.nextInt();
//        System.out.println("ENTER M VALUE");
//        int m = scn.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
//                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int j = n-1; j >=0; j--) {
//                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}
// i  j 0 1 2
// 0 - 4 1 2
// 1 - 7 4 4
// 2 - 3 7 4
// 0,0=1,0=2,0
// 2,1=1,1=0,1
// 0,2=1,2=2,2
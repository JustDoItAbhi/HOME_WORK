package lld1.DSA.dsa1.subarrays;

import java.util.Arrays;

public class Chocolate_Distribution {
    //Given an array A of N integers where the i-th element represent the number of chocolates in the i-th packet.
    //There are B number of students, the task is to distribute chocolate packets following below conditions:
    //1. Each student gets one packets.
    //2. The difference between the number of chocolates given to any two students is minimum.
    //Return the minimum difference (that can be achieved) between the student who gets minimum number of chocolates and the student who gets maximum number of chocolates.
    //Note: If you can't give each student 1 packet, return 0.
    public static int solve(int[]arr,int b){
                int n=arr.length;
        if(n==0 || b==0){
            return 0;
        }
        Arrays.sort(arr);

                int min=Integer.MAX_VALUE;

        for(int i=0;i+b-1<n;i++){
            System.out.print(arr[i]+" ");
            int diff=arr[i+b-1]-arr[i];
          min=Math.min(min,diff);
        }

        return min;
    }
    public static void main(String[] args) {
        int[]arr={3, 4, 1, 9, 56, 7, 9, 12};
        int b=5;
        System.out.println(solve(arr,b));
    }
}

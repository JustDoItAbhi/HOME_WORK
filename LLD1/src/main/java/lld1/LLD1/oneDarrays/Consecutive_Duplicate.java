package lld1.LLD1.oneDarrays;

import java.util.ArrayList;

public class Consecutive_Duplicate {
//Write a function to check if the given array A has consecutive duplicate elements or not.
//Return True if there are consecutive duplicate elements in the list else return False.
//
//Here by consecutive duplicates, we mean duplicates that are present at consecutive indices in the array

    public static boolean solve(int[]arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
        }
        if(count>=1){
            return true;
        }else{
            return false;
        }
    }
public static void main(String[] args) {
    int[]a={1, 2, 3, 3};
    System.out.println(solve(a));
    int[]c={1,2 };
    System.out.println(solve(c));
}
}

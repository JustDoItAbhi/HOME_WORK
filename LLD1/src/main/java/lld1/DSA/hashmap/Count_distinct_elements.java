package lld1.DSA.hashmap;

import java.util.HashSet;

public class Count_distinct_elements {
    //Given an array A of N integers, return the number of unique elements in the array.
    public static int solve(int[] arr){
    int n=arr.length;
    int count =0;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++){
        if(hs.contains(arr[i])==false){
            hs.add(arr[i]);
        }
        }

    return hs.size();
    }
    public static void main(String[] args) {
        int[]arr={3, 4, 3, 6, 6};//3
        System.out.println(solve(arr));

        System.out.println("_______");
        int[]arr1={3, 3, 3, 9, 0, 1,0 };//4
        System.out.println(solve(arr1));

        System.out.println("_______");
        int[]arr2={1, 2, 1, 3, 2, 4 };//4
        System.out.println(solve(arr2));

        System.out.println("_______");
        int[]arr3={7, 7, 7, 7};//1
        System.out.println(solve(arr3));

        System.out.println("_______");
        int[]arr4={1, 2, 3, 4, 5};//5
        System.out.println(solve(arr4));




    }
}

package lld1.DSA.hashmap;

import java.util.HashMap;

public class First_Repeating_element {
    //Given an integer array A of size N, find the first repeating element in it.

    //We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
    //
    //If there is no repeating element, return -1.
    public static int solve(int[]arr){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
//                    System.out.println(" i = "+i+"  j= "+j+"   "+" arr[i] "+arr[i]+",  arr[j] "+ arr[j]);
                    ans= arr[i];
                    return ans;
                }
            }
        }
        return -1;
    }
    public static int optm(int[]arr){
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
        int sum=-1;
        HashMap<Integer,Integer>map =new HashMap<>();
        for(int i=0;i<n;i++) {
            if(!map.containsKey(arr[i])) {
               map.put(arr[i], i);
            }else {
                int idx =map.get(arr[i]);
                if (idx<ans){
                    ans=idx;
                    sum=arr[i];

                }

            }
        }
        return sum;
    }
            public static void main(String[] args) {
        int[]arr={10, 5, 3, 4, 3, 5, 6};//5
                //0   1  2  3  4  5  6
//        System.out.println(solve(arr));
        System.out.println(optm(arr));

        System.out.println("_______");
        int[]arr1={6, 10, 5, 4, 9, 120 };//-1
//        System.out.println(solve(arr1));
                System.out.println(optm(arr1));

//        System.out.println("_______");
//        int[]arr2={1, 2, 1, 3, 2, 4 };//4
//        System.out.println(solve(arr2));
//
        System.out.println("_______");
        int[]arr3={7, 7, 7, 7};//1
//        System.out.println(solve(arr3));
                System.out.println(optm(arr3));


        System.out.println("_______");
        int[]arr4={1, 2, 3, 4, 5};//3
//        System.out.println(solve(arr4));

    }
}

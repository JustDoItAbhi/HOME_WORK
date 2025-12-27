package lld1.DSA.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class Count_unique_elements {
    //You are given an array arr of N integers. Return the count of elements with frequncy 1 in the given array.
    public static int solve(int[]arr){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                }
            }
            if(count==1) {
                ans++;
            }

        }
        return ans;
    }
    public static int hashing(int[]arr) {
        int n = arr.length;
        int ans = 0;
        int count=0;
       HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                count =map.get(arr[i]);
                count++;
                map.put(arr[i],count);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(int x:map.values()){
            if(x==1){
                ans++;
            }
        }
        return ans;
    }
    public static int optm(int[]arr) {
        int n = arr.length;
        int ans = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if ((i == 0 || arr[i] != arr[i - 1] )
                &&
            (i == n - 1 || arr[i] != arr[i + 1])){
                ans++;
            }
        }
    return ans;
    }
    public static void main(String[] args) {
        int[]arr={3, 4, 3, 6, 6};//1
        //0   1  2  3  4  5  6
        System.out.println("(on3)"+solve(arr));
        System.out.println("(on2)"+optm(arr));
        System.out.println("on "+hashing(arr));

        System.out.println("_______");
        int[]arr3={3, 3, 3, 9, 0, 1, 0};//9 or 1 ans = 2
        System.out.println("(on3)"+solve(arr3));
        System.out.println("(on2)"+optm(arr3));
        System.out.println("on "+hashing(arr3));
        System.out.println("_______");
        int[]arr4={1, 2, 3, 4, 5};//0
        System.out.println("(on3)"+solve(arr4));
        System.out.println("(on2)"+optm(arr4));
        System.out.println("on "+hashing(arr4));
        System.out.println("_______");
        int[]arr5={13,15,13,2,9,3,10,10,20,13};//5
        System.out.println("(on3)"+solve(arr5));
        System.out.println("(nlogn)"+optm(arr5));
        System.out.println("on "+hashing(arr5));
    }
}

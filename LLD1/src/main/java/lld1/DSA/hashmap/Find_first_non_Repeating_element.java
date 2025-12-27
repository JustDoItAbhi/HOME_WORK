package lld1.DSA.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class Find_first_non_Repeating_element {
    public static void brute(int[]arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count == 1) {
//                System.out.println(arr[i] + " ");
            }
        }
    }

        public static void solve(int[]arr) {
            int n = arr.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (map.containsKey(arr[i])) {
                    int temp=map.get(arr[i]);
                    temp++;
                    map.put(arr[i],temp);
                }else {
                    map.put(arr[i],1);

                }
            }
            for(int i=0;i<n;i++){
                if(map.get(arr[i])==1){
//                    System.out.println(arr[i]);
                }
            }

        }
        public static void hashset(int[]arr){
        int n=arr.length;
            HashSet<Integer>set=new HashSet<>();
            for(int i=0;i<n;i++){
                if(!set.contains(arr[i])){
                    set.add(arr[i]);
                }
//                set.add(arr[i]);
            }
            for(int i=0;i< set.size();i++) {
                System.out.print(set.size()+" " );
            }


        }

    public static void main(String[] args) {
        int[]arr={2,5,4,5,2,6};
        solve(arr);
        brute(arr);
        hashset(arr);
//        System.out.println(brute(arr));
//        int[]ans=brute(arr);
//        for(int x:ans){
//            System.out.print(" "+x+" ");
//        }

    }
}

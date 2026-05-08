package lld1.DSA.EPAM;

import java.util.HashMap;

public class Two_Sum {

    public static int[] solve(int[]arr, int target){
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
           int component=target-arr[i];
           if(map.containsKey(component)){
               return new int[]{map.get(component),i};
           }
           map.put(arr[i],i);
        }

        return new int[]{};
    }



    public static void main(String[] args) {

        int[]nums = {2,7,11,15}; int target = 9;
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        int[] ans=solve(nums,target);
            for(int val:ans){
                System.out.print(val+" ");
            }

        System.out.println();
        int []nums1 = {3,2,4};
        int target1 = 6;
//        Output: [1,2]
        int[] ans1=solve(nums1,target1);
        for(int val:ans1){
            System.out.print(val+" ");
        }
        System.out.println();

        int[] nums2 = {3,3};
        int target2 = 6;
//        Output: [0,1]
        int[] ans2=solve(nums2,target2);
        for(int val:ans2){
            System.out.print(val+" ");
        }
    }
}

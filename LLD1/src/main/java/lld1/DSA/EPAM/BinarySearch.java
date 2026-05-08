package lld1.DSA.EPAM;

public class BinarySearch {
    public static int solve(int[]arr, int k){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                ans=i;
            }
        }
        if(ans>0){
            return ans;
        }
        return -1;
    }
    public static int OPTIMISED(int[]arr, int target){
        int n=arr.length;
        int low=0;int high=n-1;
        int ans=0;
        while (low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else {
                high= mid-1;
            }
        }
        if(ans>0){
            return ans;
        }
        return -1;
    }


    public static void main(String[] args) {
      int[] nums = {-1,0,3,5,9,12};
      int  target = 9;
//        Output: 4
//        Explanation: 9 exists in nums and its index is 4
        System.out.println(solve(nums,target));
        System.out.println("LOG-N "+OPTIMISED(nums,target));



      int[] arr = {-1,0,3,5,9,12};
      int target2 = 2;
//        Output: -1
//        Explanation: 2 does not exist in nums so return -1
        System.out.println(solve(arr,target2));
        System.out.println("LOG-N "+OPTIMISED(arr,target2));
    }
}

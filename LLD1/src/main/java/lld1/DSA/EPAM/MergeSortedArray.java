package lld1.DSA.EPAM;

import java.util.Arrays;

public class MergeSortedArray {
    public static int[] solve(int[]arr, int[]sArr){
    int n=arr.length;
    int m=sArr.length;
    int[]newArray=new int[n+m];
    int i=0;int j=0;int k=0;
    while (i<n && j<m){
        if(arr[i]<sArr[j]){
            newArray[k]=arr[i];
            i++;
            k++;
        }else {
            newArray[k]=sArr[j];
            j++;k++;
        }
    }
    while (i<n){
        newArray[k]=arr[i];
        k++;
        i++;
    }
    while (j<m){
        newArray[k]=sArr[j];
        j++; k++;
    }
    return newArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int n = 3;
        int[]nums2 = {2,5,6} ;
        int m = 3;

        int[]ans=solve(nums1,nums2);
        for(int val:ans){
            System.out.print(val+" ");
        }
//        Output: [1,2,2,3,5,6]
//        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    }
}

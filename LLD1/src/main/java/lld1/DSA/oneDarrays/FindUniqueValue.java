package lld1.DSA.oneDarrays;

public class FindUniqueValue {
    // given an array in which all the valure are coming twice except a single number
    // which is coming once , find that single element
    public static int solve(int[]arr){
        int n=arr.length;
        int value=0;
        for(int i=0;i<n;i++){
            int val=arr[i];
            int freq=0;
            for(int j=0;j<n;j++){
               if(arr[j]==val)
            freq++;
            }
            if(freq==1){
               return val;
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        int[]arr={5,5,9,9,15,15};
        int n=arr.length;
        System.out.println(solve(arr));
        int[]arr1={1,1,2,2,5};
        System.out.println(solve(arr1));
        int[]arr2={3,9,14,16,3,14,16};
        System.out.println(solve(arr2));
        int[]arr3={5,3,13,3,5,16,13};
        System.out.println(solve(arr3));
        int[]arr4={5};
        System.out.println(solve(arr4));
    }
}

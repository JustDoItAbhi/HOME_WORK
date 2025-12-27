package lld1.DSA.dsa1.subarrays;


public class Subarray_in_given_range {
    public static int[] bruteFroce(int[]arr,int a,int b){
        int size=b-a+1;
        int[]ans=new int[size];

        for(int i=0;i<size;i++){
                ans[i] =arr[i];
//            System.out.print(" "+ans[i]+" ");
        }
        System.out.println();
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {4,3,2,6};
        int a=1;
        int b=3;
//        System.out.println(bruteFroce(arr,a,b));
        int []ans=bruteFroce(arr,a,b);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }

        System.out.println("_______");
        int[]arr1 = {4,2,2};
        int c=0;
        int d=1;
//        System.out.println(improvisedApporch(arr1));
//        System.out.println(bruteFroce(arr1,c,d));
        int []ans1=bruteFroce(arr1,c,d);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }
    }
}

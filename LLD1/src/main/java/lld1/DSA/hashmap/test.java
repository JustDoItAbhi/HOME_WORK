package lld1.DSA.hashmap;

public class test {
    public static int[] solve(int []arr, int k){
        int n=arr.length;
        int []ans=new int[n];
        for(int i=0;i<=n-k;i++){
            int count=0;
            for(int j=i;j<i+k;j++) {
                if (arr[i] != arr[j]) {
                    System.out.println(arr[i] + " " + arr[j]);
                    count++;
                }
                ans[i] = count;
            }
            System.out.println("____");
            }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={1, 2, 1, 3,4,3}; int k=3;//[2,3,3,2]
                //0  1  2  3 4 5
        int[]ans=solve(arr,k);
        for(int x:ans){
            System.out.print(" ans "+x+" ");
        }
//
//        System.out.println("_______");
//        int[]arr3={1,1,2,2};// [1,1,1,1]
//        int l=1;
//        int[]ans1=solve(arr3,l);
//        for(int x:ans1){
////            System.out.print(" "+x+" ");
//        }
    }
}

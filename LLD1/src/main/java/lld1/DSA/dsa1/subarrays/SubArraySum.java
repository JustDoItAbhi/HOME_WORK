package lld1.DSA.dsa1.subarrays;

public class SubArraySum {
    //Print single line containing subarray sums separated by space

    public static void bruteFroce(int[]arr){
        int n=arr.length;
//        int[]ps=new int[n+1];
////        ps[0]=arr[0];
//        for(int i=0;i<n;i++){
//            ps[i+1]=ps[i]+arr[i];
////            System.out.print(ps[i]+" ");
//        }
//        for(int i=0;i<n;i++){
////            System.out.print(ps[i]+" ");
//        }
        System.out.println();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[i];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[]stocksProfits = {11, 12, 6};
        bruteFroce(stocksProfits);
        System.out.println("_______");
        int[]stocksProfits1 = {1, 2, 3};
        bruteFroce(stocksProfits1);
    }
}

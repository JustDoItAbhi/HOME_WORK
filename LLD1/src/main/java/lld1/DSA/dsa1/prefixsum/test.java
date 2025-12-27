package lld1.DSA.dsa1.prefixsum;

public class test {


    public static int Equilibrium(int[]arr){
        int n=arr.length;
        int[]ps=new int[n];
        ps[0]=arr[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];
//            System.out.print(ps[i]+" ");
        }
        for(int i=0;i<n;i++){
           int leftSum=0;
            if(i>0){
               leftSum=ps[i-1];
           }
           int rightSum=ps[n-1]-ps[i];
        if(leftSum==rightSum){
            return i;
        }
        }


        return -1;
    }
    public static void main(String[] args) {
        int[]arr={-7, 1, 5, 2, -4, 3, 0};
        System.out.println(Equilibrium(arr));
//        int [][]q={{0,2},{2,4},{1,4},};
//        int[]ans= solve(arr,q);
//        for(int x:ans){
//            System.out.print(" "+x+" ");
//        }
//        System.out.println(" brute "+bruteforce(arr));
        System.out.println();


        int[]arr2={1,2,3};//3
        System.out.println(Equilibrium(arr2));
//        int [][]q2={{0,3},{3,5},{1,3},{2,4}};
//        int[]ans1= solve(arr2,q2);
//        for(int x:ans1){
//            System.out.print(" "+x+" ");
//        }
        System.out.println();
        int[]arr3={1, 2, 3, 4, 5};//3
//        int [][]q3={{0,3},{1,2}};
//     int[]ans3=solve(arr3,q3);
//     for(int x:ans3){
//         System.out.print(" "+x+" ");
//     }
    }
}

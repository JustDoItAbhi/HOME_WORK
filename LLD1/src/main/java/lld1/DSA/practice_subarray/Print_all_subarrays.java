package lld1.DSA.practice_subarray;

public class Print_all_subarrays {
    public static void solve(int[]arr){
        int  n=arr.length;
    int[]ans=new int[n];
     for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
             for(int k=i;k<=j;k++){
                 System.out.print(arr[k]+" ");
             }
             System.out.println();

         }
     }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //1
        //1 2
        //1 2 3
        //2
        //2 3
        //3
        solve(arr);
//        int[]ans=solve(arr);
//        for(int x:ans){
//            System.out.print(" "+x+" ");
//        }
        System.out.println("___________");
        int[] arr1 = {4, 5};
        //4
        //4 5
        //5
        solve(arr1);
//        int[]ans1=solve(arr1);
//        for(int x:ans1){
//            System.out.print(" "+x+" ");
//        }
        System.out.println("___________");
        int[] arr2 = {1, 1, 1};
        //1
        //1 1
        //1 1 1
        //1
        //1 1
        //1
        solve(arr2);
//        int[]ans2=solve(arr2);
//        for(int x:ans2){
//            System.out.print(" "+x+" ");
//        }
        System.out.println("___________");
        int[] arr3 = {-1, 2, -3};
        //-1
        //-1 2
        //-1 2 -3
        //2
        //2 -3
        //-3
        solve(arr3);
//        int[]ans3=solve(arr3);
//        for(int x:ans3){
//            System.out.print(" "+x+" ");
//        }
        System.out.println("___________");
        int[] arr4 = {10};
        //10
        solve(arr4);
//        int[]ans4=solve(arr4);
//        for(int x:ans4){
//            System.out.print(" "+x+" ");
//        }
    }
}

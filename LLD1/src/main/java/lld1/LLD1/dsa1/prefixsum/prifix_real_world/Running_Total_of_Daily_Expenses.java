package lld1.LLD1.dsa1.prefixsum.prifix_real_world;

public class Running_Total_of_Daily_Expenses {
    //1) Running Total of Daily Expenses (Easy)
    //You are given an array where arr[i] = money spent on day i.
    //Return the running total (prefix sum array).
    //Test Cases
    //arr = [10, 20, 30] → [10, 30, 60]
    //arr = [5] → [5] (edge case: single element)
    //arr = [] → [] (edge case: empty array)
    public static int[] solve(int [] arr){
        int n=arr.length;
        if(n<=0){
            return new int[0];
        }
        int[]ps=new int[n];
        ps[0]=arr[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        return ps;
    }

    public static void main(String[] args) {
        int[]arr={10,20,30};
        int[]ans=solve(arr);
        for(int x:ans) {
            System.out.print(" " + x + " ");
        }
        System.out.println();
        int[]arr1={5};
        int[]ans1=solve(arr1);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }
        System.out.println();

        int[] arr2={};
        int[]ans2=solve(arr2);
        for(int x:ans2){
            System.out.print(" "+x+" ");
        }
    }


}

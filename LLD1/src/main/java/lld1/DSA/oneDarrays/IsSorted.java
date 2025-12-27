package lld1.DSA.oneDarrays;

public class IsSorted {
public static boolean solve(int[]arr){
    int n=arr.length;

    for(int i=0;i<n-1;i++){
    if(arr[i]<=arr[i+1]){
        continue;
    }else {
        return false;
    }

    }
    return  true;
}


    public static void main(String[] args) {
        int[]arr={3,5,9,15};
        int n=arr.length;
        System.out.println(solve(arr));
        int[]arr1={3,5,15,5};
        System.out.println(solve(arr1));
//        int[]ans=solve(arr);
//        for(int i=0;i<n;i++){
//            ans[i]=arr[i];
//            System.out.print(ans[i]+" ");
//        }
    }
}

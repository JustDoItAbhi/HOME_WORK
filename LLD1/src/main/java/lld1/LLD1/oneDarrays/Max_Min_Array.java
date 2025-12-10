package lld1.LLD1.oneDarrays;

public class Max_Min_Array {
public static int[] solve(int [] arr){
    int n=arr.length;
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]<=min){
            min =arr[i];
        }
        if(arr[i]>max){
            max=arr[i];
        }
    }
    int[]ans=new int[2];
    for(int i=0;i<ans.length;i++){
        ans[0]=min;
        ans[1]=max;
    }
    return ans;
}

    public static void main(String[] args) {
        int[] arr={2, 3, 1, 4, 2};
        int m=5;
        int x=3;
        int n=arr.length;
        int[]ans=solve(arr);
        System.out.println();
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

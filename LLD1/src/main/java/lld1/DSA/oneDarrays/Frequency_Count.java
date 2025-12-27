package lld1.DSA.oneDarrays;

public class Frequency_Count {
    public static int[] solve(int[]arr){
        int n=arr.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                ans[i]=count;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    int[]a={1, 2, 5, 1, 5, 1 };
    int[]ans=solve(a);
    for(int x:ans){
        System.out.print(x+" ");
    }

    }
}

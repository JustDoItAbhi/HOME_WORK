package lld1.LLD1.oneDarrays;

public class Even_Odd_Elements {
    public static int solve(int[]arr){
        int n=arr.length;
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<n;i++){
        if(arr[i]%2==0){
            evenCount++;
        }else {
            oddCount++;
        }
        }
        int total=evenCount-oddCount;
        return Math.abs(total);
    }
    public static void main(String[] args) {
        int[]arr={ 1, 2, 3, 4};

        System.out.println(solve(arr));
        int[]arr1={ 2, 3, 5, 1};
        System.out.println(solve(arr1));
    }
}

package lld1.DSA.oneDarrays;

public class Separate_Odd_Even {

    //
    //You have to print the odd and even elements of array A in 2 separate lines.
    //
    //NOTE: Array elements should have the same relative order as in A.
    public static void solve(int[]arr){
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" even ");
            }
        }
        System.out.println("--==-----==----");
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" odd");
            }
        }


    }
    public static void main(String[] args) {
        int[]arr={ 1, 2, 3, 4,5};
        solve(arr);
        System.out.println("___________");
        int[]arr1={ 4,3,2};
        solve(arr1);
        System.out.println("___________");

        int[]arr2={ 2,2,2};
       solve(arr2);
        System.out.println("___________");

        int[]arr3={ 1,1};
       solve(arr3);
        System.out.println("___________");

    }
}

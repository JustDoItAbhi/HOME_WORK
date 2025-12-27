package lld1.DSA.carry_forword_or_slidingwindow;

public class Subarray_with_given_sum_and_length {
    //Given an array A of length N. Also given are integers B and C.
    //Return 1 if there exists a subarray with length B having sum C and 0 otherwise
    //Input 1:
    //A = [4, 3, 2, 6, 1]
    //B = 3
    //C = 11
    //Input 2:
    //A = [4, 2, 2, 5, 1]
    //B = 4
    //C = 6
    //Example Output
    //Output 1:
    //1
    //Output 2:
    //0
public static int solve(int[]arr, int k,int total){
    int n=arr.length;
    int ans=Integer.MIN_VALUE;
//    for(int i=0;i<k;i++){
//        sum+=arr[i];
//    }
    int s=0;int e=k-1;
    while (e<n){
        int sum=0;
        for(int i=s;i<=e;i++){
            sum+=arr[i];
        }
        if(sum==total) {
            ans = sum;
        }

        e++;s++;
    }
    return ans;
}
    public static void main(String[] args) {
        int[]arr={4, 3, 2, 6, 1};
        int k=3;
        int c=11;
        System.out.println(solve(arr,k,c));
        System.out.println("____________");
        int[]arr1={4, 3, 2, 6, 1};
        int b=4;
        int x=6;
        System.out.println(solve(arr1,b,x));

    }
}

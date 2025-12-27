package lld1.DSA.dsa1.subarrays;

public class Rain_Water_Trapped {
    //Imagine a histogram where the bars' heights are given by the array A.
    // Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.
    //Your task is to calculate the total amount of water that can be trapped in these valleys.
//Example:
//The Array A = [5, 4, 1, 4, 3, 2, 7] is visualized as below. The total amount of rain water trapped in A is 11.
public static int solve(int[]arr){
    int n=arr.length;
    int[]ps=new int[n];
    ps[0]=arr[0];
    for(int i=1;i<n;i++){
        ps[i]=ps[i-1]+arr[i];
    ps[i]=Math.max(ps[i-1],arr[i]);
    }

   int[]sufix=new int[n];
    sufix[n-1]=arr[n-1];
    for(int i=n-2;i>=0;i--) {
        sufix[i]=sufix[i+1]+arr[i];
        sufix[i]=Math.max(sufix[i+1],arr[i]);
    }
    int sum=0;

for(int i=1;i<n-1;i++){
    int leftMax=ps[i-1];
    int rightMax=sufix[i+1];
    int amount =Math.min(leftMax,rightMax)-arr[i];
    if(amount>0){
        sum+=amount;
    }
}
    return sum;
}

    public static void main(String[] args) {
        int[]A = {0, 1, 0, 2};
        System.out.println(solve(A));
        System.out.println("___________");
        int[]b = {1, 2};
        System.out.println(solve(b));
        System.out.println("___________");
        int[]c = {5, 4, 1, 4, 3, 2, 7};
        System.out.println(solve(c));
        System.out.println("___________");
    }
}

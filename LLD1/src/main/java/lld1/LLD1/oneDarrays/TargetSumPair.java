package lld1.LLD1.oneDarrays;

public class TargetSumPair {
    //give an arrray and a value K , write a func, that return true if
    // there is a pair for which A[i]+a[J]==k but (i!=j) otherwise false
    public static boolean solve(int[]arr,int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(i+" , "+j+" ");
                int sum=0;
                if(arr[i]+arr[j]==k && i!=j){
                    sum=arr[i]+arr[j];
                    return true;
                }
            }
            System.out.println();
        }
        return false;
    }
    public static boolean improved(int[]arr,int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=0;
                System.out.print(i+" , "+j+" ");
                if(arr[i]+arr[j]==k){
                    sum=arr[i]+arr[j];
//                    System.out.println("sum "+ sum);
                    return true;
                }
            }
            System.out.println();
        }
        return false;
    }
    public static void main(String[] args) {

        int[]arr={5,1,9,3,4,2};
        int k=6;
        System.out.println(solve(arr,k));
        System.out.println("_______________________");
        System.out.println(improved(arr,k));
        System.out.println("NEXT ⬇️ ");

        int[]arr1={1,1,2,2,5};
        int a=7;
        System.out.println(solve(arr1,a));
        System.out.println("_______________________");
        System.out.println(improved(arr1,a));
        System.out.println("NEXT ⬇️ ");

        int[]arr2={3,9,14,16,3,14,16};
        int b=19;
        System.out.println(solve(arr2,b));
        System.out.println("_______________________");
        System.out.println(improved(arr2,b));
        System.out.println("NEXT ⬇️ ");

        int[]arr3={5,3,13,3,5,16,13};
        int c=29;
        System.out.println(solve(arr3,c));
        System.out.println("_______________________");
        System.out.println(improved(arr3,c));
        System.out.println("NEXT ⬇️ ");

        int[]arr4={5};
        int d=5;
        System.out.println(solve(arr4,d));
        System.out.println("_______________________");
        System.out.println(improved(arr4,d));
        System.out.println("NEXT ⬇️ ");

    }
}

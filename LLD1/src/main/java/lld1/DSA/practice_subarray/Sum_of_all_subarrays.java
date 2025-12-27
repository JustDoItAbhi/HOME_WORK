package lld1.DSA.practice_subarray;

public class Sum_of_all_subarrays {
  public static int solve(int[]arr){
      int n=arr.length;
      int ans=0;
      int sum=0;
      for(int i=0;i<n;i++){
          ans+=arr[i]*(i+1)*(n-i);
      }

      return ans;
  }
    public static int brute(int[]arr){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for (int j = i; j <n; j++) {
                for(int k=i;k<=j;k++){
                    int sum=0;
                    sum+=arr[k];
                    ans+=sum;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //✅ Total Sum = 20
        System.out.println(brute(arr));
        System.out.println("___⬇️⬇️__");
        System.out.println(solve(arr));
        System.out.println("___________");
        int[] arr1 = {4, 5};
        //✅ Total Sum = 18
        System.out.println(brute(arr1));
        System.out.println("___⬇️⬇️__");
        System.out.println(solve(arr1));
        System.out.println("___________");
        int[] arr2 = {1, 1, 1};
        System.out.println(brute(arr2));
        System.out.println("___⬇️⬇️__");
        System.out.println(solve(arr2));
        //✅ Total Sum = 10
        System.out.println("___________");
        int[] arr3 = {-1, 2, -3};
        System.out.println(brute(arr3));
        System.out.println("___⬇️⬇️__");
        System.out.println(solve(arr3));
        //✅ Total Sum = -4
        System.out.println("___________");
        int[] arr4 = {3, -2, 5, 1};
        //✅ Total Sum = 34
        System.out.println(brute(arr4));
        System.out.println("___⬇️⬇️__");
        System.out.println(solve(arr4));
    }
}

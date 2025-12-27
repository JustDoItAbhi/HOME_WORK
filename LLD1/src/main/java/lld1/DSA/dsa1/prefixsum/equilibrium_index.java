package lld1.DSA.dsa1.prefixsum;

public class equilibrium_index {
    public static int bruteforce(int[]arr){
        int n=arr.length;
        int[]ps=new int[n];

        for(int i=0;i<n;i++){
      int leftsum=0;
      int rightome=0;
      for(int l=0;l<i;l++){
        leftsum+=arr[l];
      }
      for(int r=i+1;r<n;r++){
          rightome+=arr[r];
      }
      if(leftsum==rightome){
          return i;
      }
        }
        return -1;
    }
    public static int solve(int[]arr){
        int n=arr.length;
        int[]ps=new int[n];
        ps[0]=arr[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];
        }

        for(int i=0;i<n;i++){
            int l=0;
            if(i>0){
                l=ps[i-1];
            }
            int rs=ps[n-1]-ps[i];
            if(l==rs){
                return i;
            }
                }
    return -1;
    }
    public static void main(String[] args) {
        int[]arr={1, 3, 5, 2, 2};
        int [][]q={{0,2},{2,4},{1,4},};
        System.out.println(solve(arr));
        System.out.println(" brute "+bruteforce(arr));


        int[]arr2={2, 1, 8, 3, 9, 6};//3
        int [][]q2={{0,3},{3,5},{1,3},{2,4}};

        System.out.println(solve(arr2));
        System.out.println(" brute "+bruteforce(arr2));


        int[]arr3={0, -3, 5, -3, 0};//3
        // 0  1   2  3  4
        // 2  5   4  12 16

        System.out.println(solve(arr3));
        System.out.println(" brute "+bruteforce(arr3));


//        int [][]q2={{0,0},{1,2}};
//        int[]ans2=solve(arr2,q2);
//        for(int x:ans2){
//            System.out.println(" "+ x+" ");
//        }
    }
}

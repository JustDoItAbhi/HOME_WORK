package lld1.LLD1.oneDarrays;

import java.util.ArrayList;
import java.util.List;

public class Pair_Count {

    //You are given an integer array A and an integer B.
    //
    //You are required to return the count of pairs having sum equal to B.
    //
    //NOTE: pair (i,j) and (j,i) are same.
    public static int solve(ArrayList<Integer> arr,int b){
        int n=arr.size();
        int count=0;
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                if(arr.get(i)+arr.get(j)==b && j>i){
//                    System.out.println(arr[i]+" "+arr[j]);
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[]a={1,2,3,2,1 };
        int b=5;

       ArrayList<Integer>list=new ArrayList<>();
       for(int i=0;i<a.length;i++){
           list.add(a[i]);

       }
        System.out.println(solve(list,b));
        int[]c={1,1,1 };
        int d=2;
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<c.length;i++){
            list2.add(c[i]);
        }
        System.out.println(solve(list2,d));
    }
}

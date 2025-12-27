package lld1.DSA.hashmap;

import java.util.HashMap;

public class Common_Elements {
    //Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

    //Each element in the result should appear as many times as it appears in both arrays.
    //The result can be in any order.
    public static int[] solve(int[]arr, int[]querry){
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int temp=map.get(arr[i]);
                temp++;
                map.put(arr[i],temp);
            }else {
                map.put(arr[i],1);
            }
        }
        for(int x:map.values()){
            System.out.print(" "+x+" ");
        }
        int count=0;
        int[]ans=new int[querry.length];
        for(int i=0;i<querry.length;i++){
            if(map.containsKey(querry[i])){
                count++;
            }
//            ans[i]=count;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[]arr={1, 2, 2, 1};//[1, 2, 2]
                //0  1  2  3
        int[]b={2,3,1,2};

        int[]ans=solve(arr,b);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }

        System.out.println("_______");
        int[]arr3={2, 1, 4, 10};// [2, 10]
        int []c={3,6,2,10,10};
        int[]ans1=solve(arr3,c);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }
        System.out.println("_______");
//        int[]arr4={1, 2, 3, 4, 5};//0
//        int[]ans2=solve(arr4,d);
//        for(int x:ans2){
//            System.out.print(" "+x+" ");
//        }
//        System.out.println("_______");
//        int[]arr5={13,15,13,2,9,3,10,10,20,13};//5
//        int[]ans3=solve(arr5,e);
//        for(int x:ans3){
//            System.out.print(" "+x+" ");
//        }
    }
}

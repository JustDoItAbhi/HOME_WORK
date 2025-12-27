package lld1.DSA.hashmap;

import java.util.HashMap;

public class Frequency_of_element_query {
    //University organizes a series of contests aimed at helping learners enhance their coding skills. Each learner can participate in multiple contests,
    // and their participation is  represented by integers in an array. The goal is to identify how frequently each learner has participated in these contests.
    // This information will help university determine which learners are participating the least, allowing them to provide targeted support and encouragement.
    //
    //Given an array A that represents the participants of various contests,
    // where each integer corresponds to a specific learner, and an array B containing the learners for whom you want
    // to check participation frequency, your task is to find the frequency of each learner from array B in the array A and return a list containing all these frequencies

    public static int[] solve(int[]arr, int[]query){
        int n=arr.length;
        int[]ans=new int[query.length];
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
        for(int i=0;i<query.length;i++){
            if(map.containsKey(query[i])){
                ans[i]=map.get(query[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={1,2,1,1};//3,1
        int []b={1,2};
        int[]ans=solve(arr,b);
        for(int x:ans){
            System.out.print(" "+ x+ " ");
        }
        System.out.println("_______");
        int[]arr1={2,5,9,2,8};// 0,2
        int []b1={0,2};
        int[]ans1=solve(arr1,b1);
        for(int x:ans1){
            System.out.print(" "+ x+ " ");
        }
    }


}

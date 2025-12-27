package lld1.DSA.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Product_arrayGame {
    public static ArrayList<Integer> solve(ArrayList<Integer>arr){
        int n=arr.size();
        ArrayList<Integer>ps=new ArrayList<>();
        int sum=1;
        for(int x:arr){
            sum*=x;
            ps.add(sum);

        }

        ArrayList<Integer>sufix=new ArrayList<>();

        sufix.add(n-1);
        for(int i=n-2;i>=1;i--){
            sufix.add(sufix.get(i+1) *arr.get(i+1));
        }

        return sufix;
    }


    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer>ans=solve(list);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}

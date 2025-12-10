package lld1.LLD1.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Frequency_count {
    public static ArrayList<Integer> solve(ArrayList<Integer>list){
        int n=list.size();
        ArrayList<Integer>ans= new ArrayList<>();
        for(int i=0;i<n;i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;}}
            ans.add(count);
        }        return ans;}


    public static ArrayList<Integer> exam(ArrayList<Integer> list) {
        int n=list.size();
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(list.get(0));
        for(int i=1;i<n;i++){
          ans.add(ans.get(i-1)+list.get(i));
            System.out.print(ans.get(i)+" ");
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(1, 2, 5, 1, 5, 1));
        ArrayList<Integer>ans=solve(list);
        for(int i=0;i<ans.size();i++){
//            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
        ArrayList<Integer>ans1=exam(list);
        for(int i=0;i<ans1.size();i++){
            System.out.print(ans1.get(i)+" ");
        }


        System.out.println();
        ArrayList<Integer>list2= new ArrayList<>(Arrays.asList(3,10));
//        ArrayList<Integer>ans2=solve(list2);
        ArrayList<Integer>ans2=exam(list2);
        for(int i=0;i<ans2.size();i++){
            System.out.print(ans2.get(i)+" ");
        }
    }
}

package lld1.LLD1.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Multiples_of_each_element {

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int b:B) {
       ArrayList<Integer>row=new ArrayList<>();
         for(int a:A){
             if(a%b==0) {
                 row.add(a);
             }
            }
         ans.add(row);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> B1 = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<ArrayList<Integer>> ans1 = solve(A1, B1);
        System.out.println(ans1); // Output: [[1, 2, 3, 4], [2, 4]]

        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(2, 5, 9, 3, 8));
        ArrayList<Integer> B2 = new ArrayList<>(Arrays.asList(3, 2));

        ArrayList<ArrayList<Integer>> ans2 = solve(A2, B2);
        System.out.println(ans2); // Output: [[9, 3], [2, 8]]
    }
}

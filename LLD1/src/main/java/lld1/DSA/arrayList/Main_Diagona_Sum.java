package lld1.DSA.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main_Diagona_Sum {
    public static int solve(final List<ArrayList<Integer>> list){
        int n=list.size();
        int count=0;
        for(int i=0;i<n;i++){
            System.out.print(list.get(i).get(i)+" ");
          count+= list.get(i).get(i);;
        }
        return count;
    }
    public static void main(String[] args) {
        List<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>(List.of(1, -2, -3)));
        matrix.add(new ArrayList<>(List.of(-4, 5, -6)));
        matrix.add(new ArrayList<>(List.of(-7, -8, 9)));

        System.out.println(solve(matrix)); // Output: 15

        List<ArrayList<Integer>> matrix2 = new ArrayList<>();
        matrix2.add(new ArrayList<>(List.of(3, 2)));
        matrix2.add(new ArrayList<>(List.of(2, 3)));

        System.out.println(solve(matrix2)); // Output: 6
    }
}

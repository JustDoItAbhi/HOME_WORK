package lld1.DSA.strings.leetcode_string;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class FindIndexFirstOccurrenceString {
    public static  int solve(String a, String b){
        int n=a.length();
        int m=b.length();
        for(int i = 0; i <= n - m; i++){
            int j = 0;
            // compare substring
            while(j < m && a.charAt(i + j) == b.charAt(j)){
                j++;
            }
            // full match found
            if(j == m){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        System.out.println(solve("sadbutsad", "sad"));
        System.out.println(solve("leetcode","leeto"));
        System.out.println(solve("hello","ll"));
    }
}

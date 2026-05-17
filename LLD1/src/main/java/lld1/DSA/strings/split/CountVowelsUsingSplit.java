package lld1.DSA.strings.split;

import java.util.Arrays;

public class CountVowelsUsingSplit {
    public static void solve(String str){
        String[]value=str.split("[aeiouAIEOU]");
        int count= value.length-1;

        System.out.print(Arrays.toString(value));

    }
    public static void main(String[] args) {
        solve("education");
    }
}

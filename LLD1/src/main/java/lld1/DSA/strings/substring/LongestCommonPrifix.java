package lld1.DSA.strings.substring;

public class LongestCommonPrifix {
    public static String solve(String[] s){
        if (s == null || s.length == 0) {
            return "";
        }
        String prefix = s[0];
        for (int i = 1; i < s.length; i++) {

            while (s[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
    public static void main(String[] args) {
        String [] str = {"flower","flow","flight"};
        System.out.println("ans1 = "+solve(str));
        String [] str2 = {"dog","racecar","car"};
        System.out.println("ans2 = "+solve(str2));


        String st = "flower";

        System.out.println(st.indexOf("flo"));
        System.out.println(st.contains("flo"));
    }
}

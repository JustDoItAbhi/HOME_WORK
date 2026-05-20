package lld1.DSA.strings.leetcode_string;

import java.util.ArrayList;

public class ExcelSheetColumnTitle {
    public static  void solve(int x){

        StringBuilder sb=new StringBuilder();
        while (x > 0) {//FIRST CYLCLE X=28---------- 2ND CYCLE x=1

            x--; //28-1=27----------2ND CYCLE X-1=0

            int rem = x % 26;//27%26=1  ------- 2ND CYCLE 0%26 =0

            char ch = (char) ('A' + rem);//1+A=B---------2ND CYCLE  REM IS 0 SO ONLY ADD A

            sb.append(ch);//ADD B ---------2ND CYCLE ADD A

            x = x / 26;// 27/26 = 1    //2ND CYCLE   0/26 =0 LOOP END
        }

        System.out.println(sb.reverse().toString());// BA REVERSE AB
    }
    public static void main(String[] args) {
        int x = 1;//"A";
        solve(x);
        System.out.println();
        int c = 28;//"AB"
        solve(c);
        System.out.println();
        System.out.println();
        int d = 701;// "ZY"
        solve(d);
        System.out.println();

    }
}

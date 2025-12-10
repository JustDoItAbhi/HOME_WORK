package lld1.LLD1.oneDarrays;

public class Summation_Game {

    //Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user
    public static void solve(int n){
        int sum=0;
    for(int i=1;i<=n;i++){
    sum+=i;
    }
        System.out.print(sum+" ");

    }
    public static void main(String[] args) {
        int a=5;
        solve(a);
        System.out.println();
        int b=10;
        solve(b);
    }
}

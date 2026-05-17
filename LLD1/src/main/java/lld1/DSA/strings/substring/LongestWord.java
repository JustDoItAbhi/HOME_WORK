package lld1.DSA.strings.substring;

public class LongestWord {

    public static void solve(String str){
        int n=str.length();
        String []worlds=str.split(" ");
        int min=0;
        for(int i=0;i<worlds.length;i++) {
            int len = worlds[i].length();
            min = Math.max(min, len);
        }
        System.out.println(min);
        for(int i=0;i<worlds.length;i++){
            if(min== worlds[i].length()){
                System.out.println(worlds[i]);
            }
        }

        }

    public static void main(String[] args) {
        solve("I love Java programming");
    }
}

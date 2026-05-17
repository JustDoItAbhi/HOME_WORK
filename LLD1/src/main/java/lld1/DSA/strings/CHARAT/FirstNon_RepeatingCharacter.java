package lld1.DSA.strings.CHARAT;

public class FirstNon_RepeatingCharacter {
    public static  void solve(String str){
        int n= str.length();
//        boolean[]visited=new boolean[256];
        int[]visited=new int[256];
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            visited[ch]++;
        }
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(visited[ch]==1){
                System.out.println(ch);
                break;
            }
        }
    }
    public static void main(String[] args) {
        solve("aabbcdde");
    }
}

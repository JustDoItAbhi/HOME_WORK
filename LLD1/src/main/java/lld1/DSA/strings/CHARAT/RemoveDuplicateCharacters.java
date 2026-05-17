package lld1.DSA.strings.CHARAT;

public class RemoveDuplicateCharacters {
    public static String solve(String str){
        int n=str.length();
        boolean[]visited=new boolean[256];
        String ans="";
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(!visited[ch]){
                ans+=ch;
                visited[ch]=true;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solve("programming"));
    }
}

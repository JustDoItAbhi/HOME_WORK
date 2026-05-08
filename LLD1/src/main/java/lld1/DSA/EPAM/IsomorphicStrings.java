package lld1.DSA.EPAM;

public class IsomorphicStrings {
    public static boolean solve(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        int []mspSt=new int[256];
        int []mapts=new int[256];
        int n=a.length();

        for(int i=0;i<256;i++) {
            mspSt[i] = -1;
            mapts[i] = -1;
        }
         for(int i = 0; i < a.length();i++){
             char cs=a.charAt(i);
             char ct=b.charAt(i);
             if(mspSt[cs]==-1 && mapts[ct]==-1){
                 mspSt[cs]=ct;
                 mapts[ct]=cs;
             }else {
                 if(mspSt[cs]!=ct || mapts[ct]!=cs){
                     return false;
                 }
             }
        }

        return true;
    }
    public static void main(String[] args) {
       String s = "egg";
       String t = "add";//Output: true
//        The strings s and t can be made identical by:Mapping 'e' to 'a'.Mapping 'g' to 'd'.
        System.out.println(solve(s,t));

        String x = "f11";
        String y = "b23";//Output: false
//        The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.
        System.out.println(solve(x,y));

       String a = "paper";
     String  b = "title";//Output: true
        System.out.println(solve(a,b));
    }
}

package ASSIGNMENT_3;

public class que16 {
    public static boolean facb(String s,int st,int l){
        if (st>=l){
            return true;
        }
        if (s.charAt(st) !=s.charAt(l)){
            return false ;
        }
        return facb(s,st+1,l-1);

    }
    public static void main(String[] args) {
        String a="12321";
        // String s=String.valueOf(a); //to convert int into string 
        boolean result = facb(a,0,a.length()-1);
        System.out.println(result);
    }
}


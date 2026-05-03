package ASSIGNMENT_3;

public class que16 {
    public static boolean facb(String s,int n,int l){
        if (n>=l){
            return true;
        }
        if (s.charAt(n) !=s.charAt(l)){
            return false ;
        }
        return facb(s,n+1,l-1);

    }
    public static void main(String[] args) {
        String a="12321";
        String s=String.valueOf(a); //to convert int into string 
        boolean result = facb(s,0,s.length()-1);
        System.out.println(result);
    }
}


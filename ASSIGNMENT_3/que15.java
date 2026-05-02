package ASSIGNMENT_3;

public class que15 {
    static String revl(String s){
      if (s.length()==0){
        return " ";
      }
        return revl(s.substring(1))+s.charAt(0);
    }
        public static void main(String[] args) {
        String s="anuj";
        System.out.println(revl(s));
    }
}
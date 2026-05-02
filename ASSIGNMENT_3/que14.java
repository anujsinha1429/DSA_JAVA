package ASSIGNMENT_3;

public class que14 {
    static int dis(int n,int m){
        if (m==1){
            return n;
        }
        return n+dis(n,m-1);
    }
    public static void main(String[] args) {
        int n=5;
        int m=5;
        System.out.println(dis(n,m));
    }
}

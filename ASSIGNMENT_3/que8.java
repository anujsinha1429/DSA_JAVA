package ASSIGNMENT_3;

public class que8 {
    static int power(int x,int n){
        if (n==0){
            return 1;
        }
        else{
            return x*power(x, n-1);
        }
    }
}

package ASSIGNMENT_3;

public class que10 {
    static int fib(int n){
        if (n==1){
            return 1;

        }
        if (n==0){
            return 0;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }
}

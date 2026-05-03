package ASSIGNMENT_3;

public class sum {
    static int sum (int n){
        if (n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
        public static void main(String[] args) {
            int n = 5;
            System.out.println("Sum of first " + n + " natural numbers is: " + sum(n));
        }
}

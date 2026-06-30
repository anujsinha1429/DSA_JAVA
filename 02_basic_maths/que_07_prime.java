import java.util.Scanner;

public class que_07_prime {
     public boolean isPrime(int n) {
        int a =0;
        if (n <= 1) {
            return false;
           }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                a=a+1;
            }
        }
        if (a>=1){
            return false;
        }
        else {
            return true ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        que_07_prime ob = new que_07_prime();
        System.out.println("enter the digit u want to check prime no.");
        int a = sc.nextInt();
        System.out.println(ob.isPrime(a));
        sc.close();
    }

}


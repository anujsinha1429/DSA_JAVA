package ASSIGNMENT_3;

public class que9 {
    public static void rev(int n){
        if (n==0){
            return;
        }
        System.out.print(n%10);
        rev(n/10);
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.print("Reverse of " + n + " is: " );
        rev(n);
    }
}

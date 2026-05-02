package ASSIGNMENT_3;

public class que13 {
     void bin(int n){
        if (n==0||n==1){
            System.out.print(n);
        }
        else{
            bin(n/2);
            System.out.print(n%2);
        }


    }
    public static void main(String[] args) {
        que13 obj = new que13();
        int n=10;
        obj.bin(n);
    }

}

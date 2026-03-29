package ASSIGNMENT_1;
import java.util.*;
public class que5 {
    public static int sum_0f_the_digit(int n ){
        int s=0;
        int rem=0;
        while (n>0){
            rem=n%10;
            s=rem+s;
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number u want to ");
        int n= sc.nextInt();
        int result = n;
        while (result>9){
            result=sum_0f_the_digit(result);
        }
        // int a=result;
        System.out.println("the single digit is "+ result  );



sc.close();
    }
}

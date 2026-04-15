package ASSIGNMENT_3;
import java.util.Scanner;
public class que1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        try{
            System.out.println("enter the number n");
            int n=sc.nextInt();
            
            if (n<0){
                throw new NumberFormatException("number cannot be negative");
            }
            System.out.println("the number is " + n);
        }
        catch (NumberFormatException e){
            System.out.println("exception occurred: "+ e.getMessage());
        }
    }
}

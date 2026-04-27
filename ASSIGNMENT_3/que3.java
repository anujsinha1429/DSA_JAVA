package ASSIGNMENT_3;

import java.util.Scanner;

class MarksOutOfBoundException extends Exception{
    MarksOutOfBoundException(String s){
        super(s);
    }
}
public class que3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("enter the marks of the student ");
            int marks = sc.nextInt();
            sc.nextLine(); // consume the newline character
            System.out.println("enter the name of the student");
            String name = sc.nextLine();
            if (marks>100){
                throw new MarksOutOfBoundException("marks cannot be greater than 100");
            }
            System.out.println("name of the student is : " + name);
            System.out.println("marks of the student is : " + marks);
        }
        catch (MarksOutOfBoundException e){
            System.out.println("exception occurred: " + e.getMessage());
        }

    }
}

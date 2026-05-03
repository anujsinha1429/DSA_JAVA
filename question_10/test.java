package question_10;

import java.util.Scanner;

public class test extends student {
    int marks1;
    int marks2;
    
    void inputdeatails(){
        super.inputdeatails();
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the marks of the student in subject 1 : ");
        marks1=sc.nextInt();
        System.out.println("enter the marks of the student in subject 2 : ");
        marks2=sc.nextInt();
    }
    void showdeatails(){
        super.showdeatails();
        System.out.println("marks of the student in subject 1 is : " + marks1);
        System.out.println("marks of the student in subject 2 is : " + marks2);
    }

}


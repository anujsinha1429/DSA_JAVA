package question_10;

import java.util.Scanner;

public class student {
    String name;
    int rollno;
    void inputdeatails(){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the name of the student : ");
        name=sc.nextLine();
        System.out.println("enter the roll number of the student : ");
        rollno=sc.nextInt();
    }
    void showdeatails(){
        System.out.println("name of the student is : " + name);
        System.out.println("roll number of the student is : " + rollno);
    }
}



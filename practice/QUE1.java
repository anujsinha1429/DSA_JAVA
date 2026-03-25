package practice;

import java.util.Scanner;
// class Students{
//         int roll ;
//         String name;
//         double cgpa;

public class QUE1{
    public static class Students{
        int roll ;
        String name;
        double cgpa;
  
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Students s1=new Students(); //object creation or declaration

        s1.name="anuj";
        System.out.println("enter the roll no. of anuj :");
        s1.roll=sc.nextInt();
        s1.cgpa=9.0;

        Students s2=new Students();
        s2.name="shivam";
        s2.roll=41;
        s2.cgpa=9.5;

        System.out.println(s1.name +","+ s1.roll);
        sc.close();

    }
}
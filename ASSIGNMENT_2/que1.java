package ASSIGNMENT_2;

import java.util.Scanner;

class car{
        String model;
        int year;
    void setdetails(){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the model of the car :");
        model=sc.nextLine();
        System.out.println("enter the year of the car :");
        year=sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.println(model + " " + year);
    }
}
   public class que1 {
   public static void main(String[] args) {
        car c1=new car();
        car c2=new car();
        c1.model="toyota";
        c1.year=2020;
        c2.setdetails();
        c1.display();
        c2.display();
        if (c1.year>c2.year){
            System.out.println(c1.model + " is newer than " + c2.model);
        }
        else if (c1.year<c2.year){
            System.out.println(c2.model + " is newer than " + c1.model);
        }
        else{
            System.out.println("both cars are of the same year");
        }

        



   
    }
}

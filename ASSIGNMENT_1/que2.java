package ASSIGNMENT_1;

import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the persons weight ");
        int w= sc.nextInt();
        System.out.println("enter the height of the person in meter ");
        double h=sc.nextDouble();
        double BMI= w/(h*h);
        if (BMI<18.5){
            System.out.println("underweight ");
        }
        else if (BMI>=18.5 && BMI<=25.9) {
            System.out.println("normal weight ");            
        }
        else if (BMI>=25.0 && BMI<=29.9) {
            System.out.println("overweight ");

        }
        else{
            System.out.println("obese ");
        }
        sc.close();

    }
}

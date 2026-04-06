package ASSIGNMENT_1;

import java.util.Scanner;

public class home_assi_que1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the value of a, b and c ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a+b==c){
            System.out.println("a+b=c");
        }
        else if (a==b-c){
            System.out.println("a=b-c");
        }
        else if (a*b==c){
            System.out.println("a*b=c");
        }
        else{
            System.out.println("no relation found ");
        }
            sc.close();
    }
}

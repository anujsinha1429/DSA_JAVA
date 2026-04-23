package ASSIGNMENT_1;

import java.util.Scanner;

public class que3 {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the number N ");
        int n= sc.nextInt();
        int m=1;
        int add=0;
        while (n>0){
            int rem =n%10;
            m=m*rem;
            add=add+rem;
            n=n/10;
        }

        if (m==add){
            System.out.println("the number is spy ");

        }
        else{
            System.out.println("the number is not spy ");
        }
        sc.close();


    }
    
}

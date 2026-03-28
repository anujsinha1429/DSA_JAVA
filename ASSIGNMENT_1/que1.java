package ASSIGNMENT_1;

import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number u want to check");
        int n=sc.nextInt();
        int i=0;

        while(n>2){
            n=n/2;
            i++;
            }
        
        System.out.println("The number of times one must repeatedly divide this number by 2\n" + //
                        "before getting a value less than 2 is "+ i);

    sc.close();
        }
}


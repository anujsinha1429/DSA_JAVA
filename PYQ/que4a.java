package PYQ;

import java.util.Scanner;

class run{
    String name ;
    int distance ;
    void setdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name ");
        name = sc.next();
        System.out.println("enter the distance ");
        distance=sc.nextInt();
    }
    void display(){
        System.out.println(name);
        System.out.println(distance);
    }
}

public class que4a {
    public static void main(String[] args) {
        run r1=new run();
        run r2= new run();
        r1.setdata();
        r2.setdata();
        System.out.println("the details ");
        if (r1.distance>r2.distance){
            r1.display();
        }
        else{
            r2.display();
        }
        
    }
    
}

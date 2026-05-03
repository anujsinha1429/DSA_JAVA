package PYQ;

import java.util.Scanner;

class point {
    double x;
    double y;
    void setdata (){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the x component ");
        x=sc.nextDouble();
        System.out.println("enter the y component ");
        y=sc.nextDouble(); 
    }
    void display(){
        System.out.println( "x component"+ x);
        System.out.println( "y component is "+ y );
    }
    double calculate (point p){
        double dx=p.x-this.x;
        double dy=p.y-this.y;
        double dis=Math.sqrt(dx*dx + dy*dy);
        return dis;
    }
}
public class que2b {
    public static void main(String[] args) {
        point p1=new point();
        point p2=new point();
        p1.setdata();
        p2.setdata();
        p1.display();
        p2.display();
        double cal=p1.calculate(p2);
        System.out.println(cal);
        
    }
    
}

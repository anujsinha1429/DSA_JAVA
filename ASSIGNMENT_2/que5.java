package ASSIGNMENT_2;

import java.util.Scanner;

abstract class shapeq5 {
        abstract void area();

    }
    class circle extends shapeq5{
       double radius;
            circle(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the radius of the circle :");
            radius=sc.nextDouble();
        }
        void area(){
            System.out.println(3.14*radius*radius);
        }
    }
    class rectangle extends shapeq5{
        Scanner sc=new Scanner(System.in);
        double length, breadth;
         rectangle(){
            System.out.println("enter the length of the rectangle :");
            length=sc.nextDouble();
            System.out.println("enter the breadth of the rectangle :");
            breadth=sc.nextDouble();
        }
        void area(){
            System.out.println("calculating area of a rectangle"+length*breadth);
        }
    }
    class triangle extends shapeq5{
       
        double base;
        double height;
         triangle(){
             Scanner sc=new Scanner(System.in);
            System.out.println("enter the base of the triangle :");
            base=sc.nextDouble();
            System.out.println("enter the height of the triangle :");
            height=sc.nextDouble();
        }
        void area(){
            System.out.println("calculating area of a triangle"+0.5*base*height);
        }
    }
    public class que5 {
    public static void main(String[] args) {
       shapeq5 s=new circle();
        s.area();
        s=new rectangle();
        s.area();
        s=new triangle();
        s.area();
    }

}



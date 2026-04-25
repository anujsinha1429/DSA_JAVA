package ASSIGNMENT_2;

class shapeq7{
    String color;

    shapeq7(String c){
        color=c;
    }
}
class circleq7 extends shapeq7{
    double radius ;

    circleq7(String s, double r){
        super(s);
        radius=r;
    }

    double areaq7(){
        return 3.14*radius*radius;
    }
    void displayq7(){
        System.out.println("shape is a circle");
        System.out.println("color of the circle : " + color);
        System.out.println("area of the circle : " + areaq7());
    }
} 
class rectangleq7 extends shapeq7{
    double length;
    double breadth;

    rectangleq7(String s , double l , double b){
        super(s);
        length=l;
        breadth=b;
    }

    double areaq7(){
        return length*breadth;
    }
    void displayq7(){
        System.out.println("shape is a rectangle");
        System.out.println("color of the rectangle : " + color);
        System.out.println("area of the rectangle : " + areaq7());
    }
}

public class que7 {
    public static void main(String[] args) {
        circleq7 c1 = new circleq7("blue",5.0);
        rectangleq7 r1 = new rectangleq7("red",4.0,6.0);
        c1.displayq7();
        r1.displayq7();
        
    }
    
}

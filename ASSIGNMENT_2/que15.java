package ASSIGNMENT_2;

// Base class
class PointType {
    int x;
    int y;

    // constructor
    PointType(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // set coordinates
    void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // display point
    void showPoint() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    // return x
    int getX() {
        return x;
    }

    // return y
    int getY() {
        return y;
    }
}

// Derived class
class CircleType extends PointType {
    double radius;

    // constructor
    CircleType(int x, int y, double r) {
        super(x, y); // call parent constructor
        radius = r;
    }

    // set radius
    void setRadius(double r) {
        radius = r;
    }

    // display radius
    void showRadius() {
        System.out.println("Radius: " + radius);
    }

    // area
    double area() {
        return Math.PI * radius * radius;
    }

    // circumference
    double circumference() {
        return 2 * Math.PI * radius;
    }

    // display everything
    void displayCircle() {
        super.showPoint();
        showRadius();
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
}

// Main class
public class que15 {
    public static void main(String[] args) {

        CircleType c = new CircleType(3, 4, 5);

        // display
        c.displayCircle();

        // change values
        c.setPoint(6, 8);
        c.setRadius(10);

        System.out.println("\nAfter updating:");
        c.displayCircle();
    }
}
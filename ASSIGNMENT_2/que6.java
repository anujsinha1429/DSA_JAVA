package ASSIGNMENT_2;

// import java.util.Scanner;

class vehicle{
    String model;
    int year;

    vehicle(String m, int y){
        model=m;
        year=y;
    }

}
class car extends vehicle{
    int carId;
    double price ;

    car(String m,int y,int id, double p){
        super(m, y);
        carId=id;
        price=p;
    }
    void cardisplay(){
        System.out.println("model : " + model);
        System.out.println("year : " + year);
        System.out.println("car id : " + carId);
        System.out.println("price : " + price);

    }
}
public class que6 {
    public static void main(String[] args) {
        car c1=new car("Toyota Camry",2020,12345,25000.0);
        c1.cardisplay();

    }
    
}

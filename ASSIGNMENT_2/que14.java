package ASSIGNMENT_2;
class distance{
    int feet ;
    int inch;
    distance(int f,int i){
        feet=f;
        inch=i;
    }
    void display(){
        System.out.println("distance is :" + feet + "'" + inch + "''");
    }

}
class measurement extends distance{
    double centimeter;
    measurement(int f,int i,double c){
        super (f,i);
        centimeter=c;

    }
    void displaymeasurement(){
        super.display();
        System.out.println("the distance in centementer "+ centimeter);
    }
    
}

public class que14 {
    public static void main(String[] args) {
        measurement m=new measurement(25,5 ,45.0);
        m.displaymeasurement();
    }
    
}

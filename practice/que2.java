package practice;

public class que2 {
    public static class car {
        Double length;
        int seat;
        String name;
        String type;
        int torque;
    }
    public static void main(String[] args) {
        car c1= new car();
        c1.length=3.99;
        c1.name="kia sonet";
        c1.seat=5;
        c1.torque=178;
        c1.type="suv";

        change(c1);

        System.out.println(c1.seat);

    }
    public  static void change(car c1){
        c1.seat=4;
    }

    
}

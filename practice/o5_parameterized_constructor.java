package practice;

public class o5_parameterized_constructor {
    public static class car {
        Double length;
        int seat;
        String name;
    //       car(){ // default constructor
        
    // }
        car(double l,int x, String s){ // parameterized constructor
            length=l;
            seat=x;
            name=s;

        }
        void print(){
            System.out.println(name + " " + length + " " + seat);
        }   
    }
  
    public static void main(String[] args) {
        car c1= new car(5.0,4,"kia sonet");
        c1.print();
    }

       
    
}

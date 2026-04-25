package ASSIGNMENT_2;


interface flyable {
    void fly();
}
interface swimable{
    void swin();
}
class duck implements flyable,swimable{
   
    public void fly(){
        System.out.println("duck is flying");
    }
    public void swin(){
        System.out.println("duck is swimming");
    }
    String name;
        duck(String n){
            name=n;
        }

   void displaydetails(){
    System.out.println("name of the duck is : " + name);
    fly();
    swin();
   }     
}
public class que8 {
    public static void main(String[] args) {
        duck d1= new duck("panda");
        d1.fly();
        d1.swin();
        d1.displaydetails();
        
    }
    
}

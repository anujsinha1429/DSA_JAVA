package practice;

public class o3_polimorphism {
    public static class dog{
        void speek(){
            System.out.println("bhaooo bhaooooo");

        }
    }
    public static class cat{
        void speek(){
            System.out.println("meaooooo meaooooo ");

        }
    }
   public static class human{
        void speek(){
            System.out.println("hello ");

        }
    }

    
    public static void main(String[] args) {
        dog d= new dog();
        cat c= new cat();
        human h=new human();


        d.speek(); 
        c.speek();
        h.speek();    
    }
   

    
    
}

package PYQ;


interface polygonal{
    void area();
}
class rectangle implements polygonal{
    int length;
    int width;
    rectangle(int l,int b){
        length=l;
        width=b;

    }
    public void area(){
        System.out.println("area of rectangle "+ length*width);
    }
}
class square implements polygonal{
    int side;
    square(int s){
        side =s;
    }
    public void area(){
        System.out.println("area of square "+ side *side);
    }
}
public class que4c {
    public static void main(String[] args) {
        rectangle r=new rectangle(5, 2);
        square s= new square(5);
        r.area();
        s.area();
    }
    
}

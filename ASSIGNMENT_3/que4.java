package ASSIGNMENT_3;
    // Generic class
class Box<T> {
    T data;
    void set(T data) {
        this.data = data;
    }
    T get() {
        return data;
    }
}

public class que4 {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.set("Hello");
        Box<String> ref1 = b1; 
        System.out.println("b1: " + b1.get());
        System.out.println("ref1: " + ref1.get());

        ref1.set("Changed");
        System.out.println("b1: " + b1.get()); 
        System.out.println("ref1: " + ref1.get());


        Box<Integer> b2 = new Box<>();
        b2.set(10);
        Box<Integer> ref2 = b2;
        System.out.println("b2: " + b2.get());
        System.out.println("ref2: " + ref2.get());
        ref2.set(50);
        System.out.println("b2: " + b2.get());
        System.out.println("ref2: " + ref2.get());

        Box<Object> b3 = new Box<>();
        b3.set("String inside object");
        Box<Object> ref3 = b3;
        System.out.println("Object box (String) of b3 : " + b3.get());
        System.out.println("Object box (String) of ref : " + ref3.get());

        b3.set(123);

        System.out.println("Object box (Integer): " + b3.get());
        System.out.println("Object box (Integer) of ref : " + ref3.get());
    }
}


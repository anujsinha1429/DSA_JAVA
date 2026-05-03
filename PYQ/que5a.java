package PYQ;

public class que5a {
    public static void main(String[] args) {

        String[] colors = {"Red", "Blue", "Green"};

        try {
            // Exception 1: Array index out of bounds
            System.out.println(colors[5]);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error: " + e.getMessage());
        } 
        try{
             // Exception 2: Null pointer exception
            String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Error: " + e.getMessage());
        }
    }
}


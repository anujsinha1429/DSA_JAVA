package ASSIGNMENT_3;

public class que2 {
    public static void main(String[] args) {
        try {
            String[] colors = {"Red", "Blue", "Green", "Yellow"};

            // access element
            System.out.println("Color at index 2: " + colors[2]);

            // error (index out of bounds)
            System.out.println("Color at index 5: " + colors[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid index!");
        }
        try{
            String [] color=null;
            System.out.println("Color at index 0: " + color[0]);
        }
        catch (NullPointerException e) {
            System.out.println("Exception: Array is null!");
        }
    }
}

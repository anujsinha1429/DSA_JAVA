package ASSIGNMENT_3;
public class que5 {

    public static <E> void printArray(E[] inputArray) {
        // for (int i = 0; i < inputArray.length; i++) {
        //     System.out.print(inputArray[i] + " ");
        // }
        // System.out.println();
        // [1,2,3]
        for (E element : inputArray){
            System.out.print(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"A", "B", "C"};

        printArray(intArray);
        printArray(strArray);
    }
}

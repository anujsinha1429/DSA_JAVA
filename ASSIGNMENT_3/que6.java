package ASSIGNMENT_3;

public class que6 {
    public static <T> int count(T[] array, T item){
        int count =0;
        for (T element : array){
            if (item.equals(element)){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 2, 4, 2};
        String[] strArray = {"A", "B", "C", "A", "D"};

        count(intArray, 2);
        count(strArray, "A");
    }
}

// Given an integer n. You need to recreate the pattern given below for any value of N. 
// Let's say for N = 5, the pattern should look like as below:

// ABCDE
// ABCD
// ABC
// AB
// A
public class pattern_15 {
    public void pattern15(int n){
        for (int i=n;i>=0;i--){
            for (int j=65;j<65+i;j++){
                System.out.print((char)j);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        pattern_15 p15 = new pattern_15();
        p15.pattern15(5);
    }
}

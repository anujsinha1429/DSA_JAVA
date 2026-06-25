// Given an integer n. You need to recreate the pattern given below for any value of N.
//  Let's say for N = 5, the pattern should look like as below:

// A
// AB
// ABC
// ABCD
// ABCDE
public class pattern_14 {
    public void pattern15(int n){
        for (int i=0;i<n;i++){
            for (int j=65;j<=65+i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_14 p14 = new pattern_14();
        p14.pattern15(5);
    }
}

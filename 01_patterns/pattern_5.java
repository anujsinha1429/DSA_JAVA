
// Given an integer n. You need to recreate the pattern given below for any value of N.
//  Let's say for N = 5, the pattern should look like as below:

// *****
// ****
// ***
// **
// *

public class pattern_5 {
    public void pattern5(int n ){
         for (int i=n;i>0;i--){
            for (int j =0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_5 p5 = new pattern_5();
        p5.pattern5(5);
    }
}

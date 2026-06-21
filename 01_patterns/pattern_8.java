// Given an integer n. You need to recreate the pattern given below for any value of N. 
// Let's say for N = 5, the pattern should look like as below:

// *********
//  *******
//   *****
//    ***
//     *
public class pattern_8 {
    public void pattern8(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print("  ");
            }
            for (int k =0;k<2*(n-i)-1;k++){
                System.out.print(" *");
            }
            System.out.println();


        }
    }
    public static void main(String[] args) {
        pattern_8 p8 = new pattern_8();
        p8.pattern8(5);
    }
}

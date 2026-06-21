// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

//     *
//    ***
//   *****
//  *******
// *********

public class pattern_7 {
    public void pattern7(int n){
        for (int i=n;i>0;i--){
            for (int j=0;j<i-1;j++){
                System.out.print(" ");
            }
            for (int k =0;k<n-i+1;k++){
                System.out.print("*");
            }
            for (int m=0;m<n-i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_7 p7 = new pattern_7();
        p7.pattern7(5);
    }
}

// Given an integer n. You need to recreate the pattern given below for any value of N.
//  Let's say for N = 5, the pattern should look like as below:

//     * 
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *
public class pattern_9 {
    public void pattern9(int n){
        for (int i=n;i>0;i--){
            for (int k =0;k<i-1;k++){
                System.out.print(" ");
            }
            for (int j=0;j<n-i+1;j++){
                System.out.print("*");
            }
            for (int m=0;m<n-i;m++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k =n;k>i;k--){
                System.out.print("*");
            }
            for (int m=n;m>i+1;m--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_9 p9 = new pattern_9();
        p9.pattern9(5);
    }
    
}

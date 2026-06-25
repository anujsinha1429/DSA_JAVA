// Given an integer n. You need to recreate the pattern given below for any value of N. 
// Let's say for N = 5, the pattern should look like as below:

//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA

public class pattern_17 {
    public void pattern17(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<=n-i+1;j++){
                System.out.print(" ");

            }
            for (int k=65;k<65+i+1;k++){
                System.out.print((char)k);

            }
            for (int k=64+i;k>=65;k--){
                System.out.print((char)k);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_17 p17 = new pattern_17();
        p17.pattern17(5);
    }
}

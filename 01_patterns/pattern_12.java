// Given an integer n. You need to recreate the pattern given below for any value of N.
//  Let's say for N = 5, the pattern should look like as below:

// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321
public class pattern_12 {
    public void pattern12(int n){
        for (int i=1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print(j);

            }
            for (int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for (int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for (int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_12 p12 = new pattern_12();
        p12.pattern12(5);
    }
    
}

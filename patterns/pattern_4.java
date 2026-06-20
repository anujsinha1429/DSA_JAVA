package patterns;

// Given an integer n. You need to recreate the pattern given below for any value of N. 
// Let's say for N = 5, the pattern should look like as below:

// 1
// 22
// 333
// 4444
// 55555
 
public class pattern_4 {
    public void pattern4(int n){
       for (int i = 1;i<=n;i++){
            for (int j = 1;j <=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern_4 p4 = new pattern_4();
        p4.pattern4(5);
    }
}

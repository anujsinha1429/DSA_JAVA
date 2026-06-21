
// Given an integer n. You need to recreate the pattern given below for any value of N. 
// Let's say for N = 5, the pattern should look like as below:

// 12345
// 1234
// 123
// 12
// 1

public class pattern_6 {
    public void pattern6(int n ){
        for (int i = 1;i<=n;i++){
            for (int j =1;j<n+2-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern_6 p6 = new pattern_6();
        p6.pattern6(5);
    }
    
}

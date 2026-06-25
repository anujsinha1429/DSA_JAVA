// Given an integer n. You need to recreate the pattern given below for any value of N. 
// Let's say for N = 5, the pattern should look like as below:

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1
public class pattern_11 {
    public void pattern11(int n){
        int start =1;
        for (int i=0;i<n;i++){
            if (i%2==0){
                start =1;
            }
            else{
                start=0;
            }
            for (int j=0;j<=i;j++){  
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_11 p11 = new pattern_11();
        p11.pattern11(5);
    }
    
}

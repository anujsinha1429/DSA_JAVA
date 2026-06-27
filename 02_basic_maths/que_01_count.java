public class que_01_count {
    public int countDigit(int n) {
        if (n==0){
            return 1;
        }
        int a=0;
        while (n>0){
            n=n/10;
            a++;
        }
        return a;
    }
    public static void main(String[] args) {
        que_01_count obj = new que_01_count();
        int n = 12345;
        System.out.println("Number of digits in " + n + " is: " + obj.countDigit(n));
    }
}
    
    


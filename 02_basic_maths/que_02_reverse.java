public class que_02_reverse {
    public int reverseNumber(int n) {
        int rem=0;

        while (n>0){
            rem=rem*10+(n%10);
            n=n/10;
            
        }
        return rem;

    }
    public static void main(String[] args) {
        que_02_reverse obj = new que_02_reverse();
        int n = 12345;
        System.out.println("Reverse of " + n + " is: " + obj.reverseNumber(n));
    }
    
}

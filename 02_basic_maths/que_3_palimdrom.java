public class que_3_palimdrom {
     public boolean isPalindrome(int n) {
        int s=n;
        int rem=0;
        while (n>0){
            rem=rem*10+(n%10);
            n=n/10;
        }
        if (s==rem){
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {
        que_3_palimdrom obj = new que_3_palimdrom();
        int n = 12321;
        if (obj.isPalindrome(n)){
            System.out.println(n + " is a palindrome number.");
        }
        else {
            System.out.println(n + " is not a palindrome number.");
        }
    }
}

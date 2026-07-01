public class que_08_palindrom {
    public boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        que_08_palindrom ob1 = new que_08_palindrom();
        String str = "racecar";
        int n = str.length();
        boolean result = ob1.isPalindrome(str, 0, n - 1);
        if (result) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

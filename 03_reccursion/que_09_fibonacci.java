public class que_09_fibonacci {
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        que_09_fibonacci ob1 = new que_09_fibonacci();
        int n = 10; // Change this value to get more or fewer Fibonacci numbers
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(ob1.fibonacci(i) + " ");
        }
    }
}

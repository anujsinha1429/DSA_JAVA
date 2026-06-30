public class que_03_1toN{
    public void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        que_03_1toN ob1=new que_03_1toN();
        ob1.printNumbers(5);
    }

}

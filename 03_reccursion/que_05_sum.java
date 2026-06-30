public class que_05_sum {
    public int sum(int n){
        if (n==0){
            return 0;
        }
        else {
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        que_05_sum ob1=new que_05_sum();
        int a= ob1.sum(5);
        System.out.println(a);
    }
}

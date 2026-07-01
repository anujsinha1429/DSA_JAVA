public class que_06_factorial {
    public int fact(int n ){
        if (n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        que_06_factorial ob1 =new que_06_factorial();
        int a= ob1.fact(5);
        System.out.println(a);
        
    }
}

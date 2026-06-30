public class que_04_Nto1 {
    public void printto(int n ){
        if (n==1){
            System.out.println(1);
        }
        else{
            System.out.println(n);
            printto(n-1);
        }
        
    }
    public static void main(String[] args) {
        que_04_Nto1 ob1=new que_04_Nto1();
        ob1.printto(5);
    }
}

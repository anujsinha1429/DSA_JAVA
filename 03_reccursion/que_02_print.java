public class que_02_print {
    public void added(int n,int a){
        if (n>a){
            return ;
        }
        else {
            System.out.println(n);
            added(n+1, a);
        }
    }
    public static void main(String[] args) {
        que_02_print ob=new que_02_print();
        ob.added(1,5 );
    }
}

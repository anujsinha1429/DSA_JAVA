public class pattern_18 {
    public void pattern18(int n){
        for (int i=1;i<=n;i++){
            for (int j=65+n-i;j<65+n;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pattern_18 p18 = new pattern_18();
        p18.pattern18(5);
    }
}

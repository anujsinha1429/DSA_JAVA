public class pattern_21 {
    public void pattern21(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_21 p21 = new pattern_21();
        p21.pattern21(5);
    }
}

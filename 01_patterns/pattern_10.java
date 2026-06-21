public class pattern_10 {
    public void pattern10(int n){
        for (int i=0;i<n;i++){
            for (int j =0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n-1;i>0;i--){
            for (int j =0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern_10 p10 = new pattern_10();
        p10.pattern10(5);
    }
}

public class pattern_20 {
    public void pattern20(int n){
        int start =n*2-2;
        for (int i=0 ; i <n;i ++){
            for (int j =0;j<=i;j++){
                System.out.print("*");
            }
            for (int k=0;k<start;k++){
                System.out.print(" ");
            }
            for (int j =0;j<=i;j++){
                System.out.print("*");
            }
            start=start-2;
            System.out.println();
        }
        start=2;
        for (int i =n-1;i>0;i--){
            for (int j =0;j<i;j++){
                System.out.print("*");
            }
            for (int k=0;k<start;k++){
                System.out.print(" ");
            }
            for (int j =0;j<i;j++){
                System.out.print("*");
            }
            start=start+2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_20 p20 = new pattern_20();
        p20.pattern20(5);
    }
}

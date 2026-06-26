public class pattern_19 {
    public void pattern19(int n ){
        int start = 0;
        for (int i =0 ;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            // for (int k=0;k<i;k++){
            //     System.out.print(" ");
            // }
            // for (int k=0;k<i;k++){
            //     System.out.print(" ");
            // }
            for (int k=0;k<start;k++){
                System.out.print(" ");
            }
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            start=start+2;
            System.out.println();
        }
        start=start-2;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            // for (int k =n-i;k>1;k--){
            //     System.out.print(" ");
            // }
            // for (int k =n-i;k>1;k--){
            //     System.out.print(" ");
            // }
            for (int k=0;k<start;k++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            start=start-2;
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pattern_19 p19 = new pattern_19();
        p19.pattern19(5);
    }
    
}

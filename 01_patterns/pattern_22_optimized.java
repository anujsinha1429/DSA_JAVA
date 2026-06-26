public class pattern_22_optimized {
    public void pattern22(int n){
        for (int i=0;i<2*n-1;i++){
            for (int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                int num = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(" " + (n-num));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_22_optimized p22 = new pattern_22_optimized();
        p22.pattern22(5);
    }
    
}

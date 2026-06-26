public class pattern_22 {
    public void pattern22(int n){
        for (int i=1;i<n+n;i++){
            for (int j=1;j<=n+n-1;j++){
                if(j==n-(n-1) || j==n+n-1 ||i==1|| i==n+n-1){
                    System.out.print(" 5");
                }
                else if(j==n-(n-2) || j==n+n-2 || i==2 || i==n+n-2){
                    System.out.print(" 4");
                }
                else if(j==n-(n-3) || j==n+n-3 || i==3 || i==n+n-3){
                    System.out.print(" 3");
                }
                else if(j==n-(n-4) || j==n+n-4 || i==4 || i==n+n-4){
                    System.out.print(" 2");
                }
                else{
                    System.out.print(" 1");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_22 p22 = new pattern_22();
        p22.pattern22(5);
    }
}

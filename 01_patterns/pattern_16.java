public class pattern_16 {
    public void pattern16(int n){
        for (int i=0;i<n;i++){
            for (int j=65;j<=65+i;j++){
                System.out.print((char)(65+i));
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern_16 p16 = new pattern_16();
        p16.pattern16(5);
    }
}

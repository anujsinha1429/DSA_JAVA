package ASSIGNMENT_1;

public class que9 {
    public static double sumMajorDiagonal(double[][] m){
    double sum=0;
    for (int i = 0;i<m.length;i++){
        sum=sum+m[i][i];
    }
    return sum;
}
    public static void main(String[] args) {
        double m[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(m.length);
        System.out.println("the sum of the major diagonal is "+ sumMajorDiagonal(m));
    }
    
}

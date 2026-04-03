package ASSIGNMENT_1;

import java.util.Scanner;

public class que10 {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum=0;
        for (int i = 0;i<m.length;i++){
            sum=sum+m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double m[][]={{1,2,3,9},{4,5,6,5},{7,8,9,6},{1,2,3,4}};
        System.out.println("enter the column index u want to sum ");
        int n = sc.nextInt();
        System.out.println("the sum of the column is "+ sumColumn(m, n-1));
        sc.close();
    }
}

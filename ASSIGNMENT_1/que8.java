package ASSIGNMENT_1;

import java.util.Scanner;

public class que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row ");
        int row= sc.nextInt();
        System.out.println("enter the column ");
        int col= sc.nextInt();
        int arr[][]=new int [row][col];
        System.out.println("enter the element of the array:");
        for (int i = 0;i<row;i++){
            for (int j =0 ;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the array is :");
        for(int i = 0;i <row;i++){
            for (int j =0;j<col;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println("the sum of the array is "+ sum);
        sc.close();
    }
}

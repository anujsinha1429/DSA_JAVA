package ASSIGNMENT_2;

import java.util.Scanner;

class bank{
    String bankname;
    double depositamount;
    static double totalamount ;

    void setbankname(){
    Scanner b=new Scanner(System.in);
    System.out.println("enter the name of the bank ");
    bankname=b.nextLine();

   }
   void setamount(){
    Scanner b=new Scanner(System.in);
    System.out.println("enter the deposit amount more then 1000");
    depositamount=b.nextDouble();
    totalamount=totalamount+depositamount;
   }
   void showdata(){
    System.out.println("Bank Name: " + bankname);
    System.out.println("Deposit Amount: " + depositamount);
    System.out.println("total amount "+totalamount);
   
   }

}

public class que13 {
    public static void main(String[] args) {
        bank[] b=new bank[5];
        for (int i =0;i<5;i++){
            b[i]=new bank();
            System.out.println("Enter details for bank " + (i+1) + ":");
            b[i].setbankname();
            b[i].setamount();
        }
        for (int i=0;i<5;i++){
            b[i].showdata();
        }
   
        int min=0;
        for (int i=1;i<5;i++){
            if (b[min].depositamount >b[i].depositamount){
                min=i;


    }
        }
        System.out.println("Details of bank with lowest deposit amount:");
        b[min].showdata();
    }
    
}

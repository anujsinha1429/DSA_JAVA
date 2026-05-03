package PYQ;

import java.util.Scanner;

class saleman{
    int empid ;
    String name ;
    double sales;
    saleman(int e,String n,double s){
        empid =e;
        name = n;
        sales= s;

    }
    double  getcommision(){
        if (sales<500){
            return 0.02*sales;
        }
        else if (sales >=500 && sales<5000){
            return 0.05*sales;
        }
        else{
            return 0.08*sales;
        }
    }
    void display(){
        System.out.println("empid :"+ empid);
        System.out.println("name "+name);
        System.out.println("sales :"+sales );
        System.out.println("com :" +getcommision());
    }
}
public class tester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        saleman[] s=new saleman[5];
        for (int i=0;i <5 ; i ++){
            System.out.println("enter empid name sales ");
        int e=sc.nextInt();
        String n=sc.next();
        double sa=sc.nextDouble();
        s[i] = new saleman(e, n, sa);

    }
        for (int i =0 ;i<5;i++){
             System.out.println(s[i].name  + " com "+ s[i].getcommision());
    }

      // saleman s1=new saleman(2, "shivam" , 5000);
        // double com=s1.getcommision();
        // s1.display();
        // System.out.println(com);



    }
    
}

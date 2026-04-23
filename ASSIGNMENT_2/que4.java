package ASSIGNMENT_2;


class deposit{
  
    long principal;
    int time;
    double rate;
    double total_amt;
    
    deposit(){
        principal=1000;
        time=2;
        rate=5.0;
    }
    deposit(long p,int t,double r){
        principal=p;
        time=t;
        rate=r;
    }
    deposit(long p,int t){
        principal=p;
        time=t;
    }
    deposit(long p , double r){
        principal=p;
        rate=r;
    }
    void display(){
        System.out.println("principal : " + principal);
        System.out.println("time : " + time);
        System.out.println("rate : " + rate);
        System.out.println("total amount : " + total_amt);
    }
    void calculate(){
        total_amt=principal+(principal*rate*time)/100;
    }
}
public class que4 {
    public static void main(String[] args) {
        deposit d1=new deposit();
        deposit d2=new deposit(2000,3,7.5);
        deposit d3=new deposit(1500,4);
        deposit d4=new deposit(2500,6.0);
        d1.calculate();
        d1.display();
        d2.calculate();
        d2.display();
        d3.calculate();
        d3.display();
        d4.calculate();
        d4.display();

}
}

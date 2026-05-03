package PYQ;

class CreditLimitCrossedException extends Exception{
    CreditLimitCrossedException(String s){
        super(s);
    }
}
class creditCard{
    String cardNumber;
    double currentOutstanding;
    final double maxpurchaselimit;

    creditCard(String cardNumber,double limit){
        this.cardNumber=cardNumber;
        this.maxpurchaselimit=limit;
        this.currentOutstanding=0;
    }
    void purchase (int amount) throws CreditLimitCrossedException{
        if (currentOutstanding+amount<=maxpurchaselimit){
            currentOutstanding=currentOutstanding+amount;
            System.out.println("purchase successfully ");
        }
        else {
            throw new CreditLimitCrossedException("insufisient balance ");
        }
    }
    void display(){
        System.out.println("cardNumber"+cardNumber);
        System.out.println("currentOutstanding"+currentOutstanding);
        System.out.println("maxpurchaselimit"+maxpurchaselimit);
    }
}

public class que5according2q {
    public static void main(String[] args) {
    creditCard c1=new creditCard("4764477873", 5000);
    try {
        c1.purchase(2000);
        c1.display();

        c1.purchase(4000);
        c1.display();

    
    }
    catch(CreditLimitCrossedException e){
        System.out.println(e.getMessage());

    }
    

    
}}

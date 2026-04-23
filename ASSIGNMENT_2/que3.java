package ASSIGNMENT_2;
class book{
        int bookid;
        double price;
        int quantity ;
        static double totalprice;
    book(int bookid,double price,int quantity){
        this.bookid=bookid;
        this.price=price;
        this.quantity=quantity;
        totalprice=totalprice+totalamount();
    }
    void display(){
        System.out.println("book id : " + bookid);
        System.out.println("price : " + price);
        System.out.println("quantity : " + quantity);
    }
    double totalamount(){
        return price*quantity;
    }
}
public class que3 {
public static void main(String[] args) {
    book b1=new book(1,250.0,2);
    book b2=new book(2,300.0,3);
    book b3=new book(3,500.0,1);
    book b4=new book(4,200.0,4);
    book b5=new book(5,150.0,5);
    b1.display();
    b2.display();
    b3.display();
    b4.display();
    b5.display();
    System.out.println("total price of all books : " + book.totalprice);
}


}

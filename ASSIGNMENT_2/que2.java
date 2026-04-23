package ASSIGNMENT_2;
import java.util.Scanner;


class complex{
        int real;
        int img;
    
    void setdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the real part of the complex number :");
        real=sc.nextInt();
        System.out.println("enter the imaginary part of the complex number :");
        img=sc.nextInt();
        
    }
    void display(){
        System.out.println(real + " + " + img + "i");

    }
    public complex add(complex c1, complex c2){
    complex c3=new complex();
    c3.real=c1.real+c2.real;
    c3.img=c1.img+c2.img;
    return c3;
}
    }
    public class que2 {
public static void main(String[] args) {
    complex c1=new complex();
    complex c2=new complex();
    c1.setdata();
    c2.setdata();
    System.out.println("the first complex number is :");
    c1.display();
    System.out.println("the second complex number is :");
    c2.display();
    complex c3=new complex();
    c3=c3.add(c1, c2);
    System.out.println("the sum of the two complex numbers is :");
    c3.display();


}


    
}


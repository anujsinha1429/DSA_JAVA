package ASSIGNMENT_2;
import java.util.Scanner;
class studentq11{
    int roll ;
    String name;
    int dsa_marks;
    void getdata(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter roll number:");
        roll = sc.nextInt();
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter DSA marks:");
        dsa_marks = sc.nextInt();
    }
    void showdata(){
        System.out.println("Roll number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("DSA Marks: " + dsa_marks);
    }
}
public class que11 {
    public static void main(String[] args) {
        studentq11[] s=new studentq11[5];
        for (int i=0;i<5;i++){
            s[i]=new studentq11();
            System.out.println("Enter details for student " + (i+1) + ":");
            s[i].getdata();
        }
        int max=0;
        for (int i=1;i<5;i++){
            if ( s[max].dsa_marks < s[i].dsa_marks ){
                max=i;
            }
        } 
        System.out.println("Details of student with highest DSA marks:");
        s[max].showdata();
    }
}

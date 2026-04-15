package ASSIGNMENT_2;


class empployess{
    String name ;
    double salary;

    empployess(String n, double s){
        name=n;
        salary=s;
    }
    void displaydetails(){
        System.out.println("name of the employee is : " + name);
        System.out.println("salary of the employee is : " + salary);
    }
}
class manager extends empployess{
    String department;
    manager(String n,double s,String d){
        super(n, s);
        department=d;

    }
    void displaymanagerinfo(){
        super.displaydetails();
        System.out.println("department of the manager is : " + department);
    }
}
public class que9 {
    public static void main(String[] args) {
        manager m1= new manager("anuj", 500000,"IT");
        m1.displaymanagerinfo();
    }
    
}

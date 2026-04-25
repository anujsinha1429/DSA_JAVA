package ASSIGNMENT_2;

class person{
    String name;
    int age;


    person(String s,int a){
        name=s;
        age=a;
    }
}
class employee extends person{
    int eid;
    double salary;
    employee(String b,int y,int e,double sal){ //u can change the varible in super it is not neccesary that u have to take same as parent class 
        super(b,y);
        eid=e;
        salary=sal;
    }
    void empldetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + eid);
        System.out.println("Salary: " + salary);
    }
}

public class que12 {
    
}

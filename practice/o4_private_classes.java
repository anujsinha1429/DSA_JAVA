package practice;

class Students{
    private int roll;
    double cgpa;
    String name;

    int getroll(){
        return roll;
    }

    void setroll(int x){
        roll=x;

    }
    void print(){
        System.out.println(name + " " + cgpa + " " + roll);

    }

}




public class o4_private_classes {
  public static void main(String[] args) {
    Students s1=new Students();
    s1.name="anuj";
    s1.cgpa=8.9;
    s1.setroll(98);
    int roll1=s1.getroll();
    System.out.println("roll no. " + roll1);
    s1.print();
    
  }

    
}

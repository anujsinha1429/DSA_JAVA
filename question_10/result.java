package question_10;
import que10.sports;
public class result extends test implements sports{
    void calculate(){
        int total=marks1+marks2+score1+score;
        showdeatails();
        System.out.println("the grand total score of the student is : " + total);
        System.out.println("total score of the student is : " + (score1+score));

    }   
            public static void main(String[] args) {
            result r1= new result();
            r1.inputdeatails();
            r1.calculate();
            
        }   
}

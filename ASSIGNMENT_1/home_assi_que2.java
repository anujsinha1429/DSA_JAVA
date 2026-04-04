package ASSIGNMENT_1;

import java.util.ArrayList;
import java.util.Scanner;

public class home_assi_que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("enter the lines (empty line to stop) ");
        while(true){
            String line = sc.nextLine();
            if (line.isEmpty()){
                break;
            }
            list.add(line);
        }
        System.out.println("the reverse of the lines is :");
        for (int i = list.size()-1;i>=0;i--){
            System.out.println(list.get(i));

            }
            sc.close();
        
    }
    
    
}

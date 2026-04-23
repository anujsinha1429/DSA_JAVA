package ASSIGNMENT_1;

import java.util.Scanner;

public class que6 {
    public static boolean isOdd(int n){
    //     return (n & 1)==1;
    // }
    String s=String.valueOf(n); //convert int into string 
    char a=s.charAt(s.length()-1);
    if (a=='1' || a=='3' || a=='5' || a=='7' || a=='9'){
        return true;
    }
    else{
        return false;
    }
}

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the no. u want to check odd ");
        int n = sc.nextInt();
        System.out.println(isOdd(n));
        sc.close();
    }
    
}

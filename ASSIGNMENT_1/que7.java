package ASSIGNMENT_1;

import java.util.Scanner;

public class que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array ");
        int n = sc.nextInt();
        int array[] =new int[n];
        System.err.println("enter the element of the array ");
        for (int i = 0 ; i <n;i++){
            array[i]=sc.nextInt();
        }
        int max=array[0];
        int min=array[0];
        int maxcount=0;
        int mincount=0;
        int minpos=0;
        int maxpos=0;
        for (int i = 0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
                maxcount=1;
                maxpos=i;
            }
            else if (array[i]==max){
                    maxcount=maxcount+1;
            }
            
            if (min>array[i]){
                min=array[i];
                minpos=i;
                mincount=1;
            }
            else if (array[i]==min){
                    mincount=mincount+1;
                    minpos=i;
            }
        }
        System.out.println("the maximum element is "+ max+"  and occurs "+ maxcount+ " times");
        System.out.println("the minimum element is "+ min+"  and occurs "+ mincount+ " times");
        System.out.println("the maximum element is present at "+ (1 + maxpos));
        System.out.println("the minimum element is present at "+ (1 + minpos));

        sc.close();

    }
    
}

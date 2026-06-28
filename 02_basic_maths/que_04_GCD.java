public class que_04_GCD {
    // GCD of two numbers using recursion
    //     public int GCD(int n1, int n2) {
    //     if (n2==0){
    //         return n1;
    //     }
    //     else{
    //         return GCD(n2,n1%n2);
    //     }

    // }
    // GCD of two numbers using iteration
    public int GCD(int n1, int n2){
        while (n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;

        }
        return n1;

    }
    public static void main(String[] args) {
        que_04_GCD obj = new que_04_GCD();
        int n1 = 48;
        int n2 = 18;
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + obj.GCD(n1, n2));
    }
    

}


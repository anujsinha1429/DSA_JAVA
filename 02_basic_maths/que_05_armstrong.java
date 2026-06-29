class Armstrong {
    public boolean isArmstrong(int n) {
        int rem=0;
        int s=n;
        int ar=0;
        // while (n>0){
        //     rem=n%10;
        //     ar=ar+(int)Math.pow(rem,3);
        //     n=n/10;
        // }
        int sum=0;
        while (n>0){
                rem=n%10;
                sum=(rem*rem*rem);
                ar=ar+sum;
                n=n/10;
            }

        return s==ar;

    }
    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        int n = 153;
        if (obj.isArmstrong(n)){
            System.out.println(n + " is an Armstrong number.");
        }
        else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}

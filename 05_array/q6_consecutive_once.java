public class q6_consecutive_once {
    public int consecutiveOnce(int nums[]) {
        int max=0;
        int count=0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==1){
                count++;
            }else{
                if (count>max){
                    max = count;
                }
                count = 0;
            }if(count>max){
                max = count;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,1,1,1,0,1,1,0};
        q6_consecutive_once obj = new q6_consecutive_once();
        int result = obj.consecutiveOnce(nums);
        System.out.println("Maximum consecutive 1's: " + result);
    }
}

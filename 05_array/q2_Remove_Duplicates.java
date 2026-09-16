public class q2_Remove_Duplicates {
    public int removeDuplicates(int[] nums) {
        int a = nums.length;
        int j=0;
        for (int i = 1 ; i < a ; i++){
            if (nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
            else{
                i++;
                
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,2,2,3,3,4,4};
        q2_Remove_Duplicates obj = new q2_Remove_Duplicates();
        int result = obj.removeDuplicates(nums);
        System.out.println("The length of the array after removing duplicates is: " + result);
        System.out.print("The modified array is: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

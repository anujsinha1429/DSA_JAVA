public class q5_remove_zero {
    public void removeZero(int nums[]) {
        int j=0;
        while(j<nums.length && nums[j]!=0){
            j++;
        }
        for (int i=j+1;i<nums.length;i++){
            if (nums[i]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 3, 4, 0, 5};
        q5_remove_zero obj = new q5_remove_zero();
        obj.removeZero(nums);
        System.out.print("Array after removing zeros: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}

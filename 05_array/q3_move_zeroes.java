public class q3_move_zeroes {
    class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0;

        // Find first zero
        while (j < nums.length && nums[j] != 0) {
            j++;
        }

        // Move non-zero elements forward
        for (int i = j + 1; i < nums.length; i++) {

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}
}

public class q4_linear_search {
    class Solution {
    public int linearSearch(int nums[], int target) {
        for (int i=0;i< nums.length;i++){
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
		//Your code goes here
    }
}
public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        q4_linear_search obj = new q4_linear_search();
        Solution solution = obj.new Solution();
        int result = solution.linearSearch(nums, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
}
    
}

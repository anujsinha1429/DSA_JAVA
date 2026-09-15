import java.util.ArrayList;
class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        // boolean flag=false;
        for (int i=1;i< nums.size();i++){
            if (nums.get(i)<nums.get(i-1)){
                return false;
            }
      }
      return true;
    }
}
public class q1_SortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(solution.isSorted(nums)); // Output: true

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(5);
        nums2.add(3);
        nums2.add(4);
        System.out.println(solution.isSorted(nums2)); // Output: false
    }
}
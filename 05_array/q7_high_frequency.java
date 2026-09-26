import java.util.HashMap;

public class q7_high_frequency {
    class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> dic=new HashMap<>();
        int count_max=0;
        int ans=0;
        for(Integer ele: nums){
            if (dic.containsKey(ele)){
                dic.put(ele,dic.get(ele)+1);
            }else{
                dic.put(ele,1);
            }
        }
        for(Integer ele: dic.keySet()){
            if (dic.get(ele)>count_max) {
                count_max=dic.get(ele);
                ans=ele;

            }
        }
        return ans;

    }
}
public static void main(String[] args) {
    int[] nums = {3, 2, 3};
    q7_high_frequency.Solution solution = new q7_high_frequency().new Solution();
    int majorityElement = solution.majorityElement(nums);
    System.out.println("The majority element is: " + majorityElement);
}
}

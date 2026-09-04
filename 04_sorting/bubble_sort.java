 class Solution {
    public static void printarray(int arr[]){
        for (int i=0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int[] bubbleSort(int[] nums) {
       
        for (int i=0;i<nums.length-1;i++){
            //  boolean swap=false;
            for(int j=0;j<nums.length-i-1;j++){
                if (nums[j]>nums[j+1]){
                    // swap
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;

                    // swap=true;
                }
            }
            // if (!swap){
            //     break;
            // }
        }
        // printarray(nums);
        return nums;


    }
    public static void main(String[] args) {
        
        Solution s = new Solution();
        int arr[]={5,4,3,2,1};
        s.bubbleSort(arr);
        printarray(arr);
    }
 }

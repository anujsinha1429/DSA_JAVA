public class selection_sort {
    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int [] sortingarray(int [] nums ){
        // int smallest=nums[0];
        for(int i =0; i < nums.length; i++){
            int smallest=nums[i];
            for (int j=i+1; j<nums.length;j++){
                if (smallest>nums[j]){
                    smallest=nums[j];
                }
                int temp=smallest;
                nums[j]=nums[i];
                nums[i]=temp;
                
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        
        selection_sort s = new selection_sort();
        int arr[]={5,4,3,2,1};
        s.sortingarray(arr);
        printarray(arr);
    }
}
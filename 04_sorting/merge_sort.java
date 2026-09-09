import java.util.ArrayList;

public class merge_sort {
    public int[] merge(int[] arr, int strt,int mid, int end ){
        ArrayList<Integer> temp = new ArrayList<>();
        int i=strt;
        int j=mid+1;
        while (i<=mid && j<=end){
            if (arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                 temp.add(arr[j]);
                 j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;

        }
        while(j<=end){
            temp.add(arr[j]);
                 j++;

        }
        for (int k=0; k< temp.size();k++){
            arr[strt+k]=temp.get(k);
        }
      return arr;
    }
    public int[] mergeSort(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    public int[] mergeSort(int[] nums, int strt, int end) {
        if (strt<end){
            int mid=strt+(end-strt)/2;
            mergeSort(nums,strt,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,strt,mid,end);
        }
        return nums;

    }
    public static void main(String[] args) {
        merge_sort s = new merge_sort();
        int arr[]={5,4,3,2,1};
        s.mergeSort(arr);
        for (int i=0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}


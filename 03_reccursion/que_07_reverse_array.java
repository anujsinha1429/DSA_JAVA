public class que_07_reverse_array {
    public void reverse(int[] arr , int n){
        reverseArray(arr, 0, n-1);
    }
    public void reverseArray(int[] arr, int start, int end){
        if (start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
    public static void main(String[] args) {
        que_07_reverse_array ob1 = new que_07_reverse_array();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        ob1.reverse(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

package ASSIGNMENT_3;

public class que12 {
    static void rin(int arr [],int s,int l,int n){
        if (s>l){
            return;
        }
        int mid =s+l/2;
        if (arr[mid]==n){
            System.out.println("the number is found at index "+ mid);
        }
        else if(n<arr[mid]){
            rin(arr,s,mid-1,n);
        }
        else{
            rin(arr,mid+1,l,n);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=5;
        rin(arr,0,arr.length-1,n);
    }
}

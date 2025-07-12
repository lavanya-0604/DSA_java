package binarysearch_dsa;
//order agnostic array is when we doesnt know whether the array is in ascending or descending order
public class OrderAgnosticBS {
    public static void main(String[] args) {
          int[]arr ={50,43,32,21,10,5,3};
          int target = 32;
          System.out.println(orderagnosticBS(arr,target));
    }
    static int orderagnosticBS(int[]arr,int target){
        int left = 0;
        int right = arr.length-1;
        boolean isAsc = arr[left]<arr[right];
        while(left <= right) {
            int mid = left +(right - left) / 2;
            if(arr[mid]==target){
                return mid;
            }
           if(isAsc==true) {
               if (arr[mid] > target) {
                   right = mid - 1;
               } else if (arr[mid] < target) {
                   left = mid + 1;
               }
           }
           else{
               if (arr[mid] < target) {
                   right = mid - 1;
               } else if (arr[mid] > target) {
                   left = mid + 1;
               }
           }
        }
        return -1;
    }
}

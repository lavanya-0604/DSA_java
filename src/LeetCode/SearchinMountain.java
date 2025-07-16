package LeetCode;

public class SearchinMountain {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,3,1};
        int target = 1;
        System.out.println(ans(arr,target));
    }
    public static int ans(int[] arr, int target){
      int peak =  peakIndexInMountainArray(arr);
      int firsttry = orderagnosticBS(arr,target,0,peak);//this id for the ascending order
      if(firsttry != -1){
          return firsttry;
      }
      return orderagnosticBS(arr,target,peak+1,arr.length-1);//this if for the descending order
    }
    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start< end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    static int orderagnosticBS(int[]arr,int target,int start,int end){
        boolean isAsc = arr[start]<arr[end];
        while(start <= end) {
            int mid = start +(end - start) / 2;
            if(arr[mid]==target){
                return mid;
            }
            //for ascending order
            if(isAsc==true) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            }
            //for descending order
            else{
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

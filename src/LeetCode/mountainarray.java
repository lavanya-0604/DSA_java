package LeetCode;
//mountain array means increasing in the start and decreasing in the end which forms the mountain
//also called as the Bitonic Array
//dividing the array where the first half will be sorted and second array also so we are using the BS
//linear search is avoided bcs of the time complexity
public class mountainarray {
    public static void main(String[] args) {

    }
  public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start< end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                //now we are in the decreasing order
                //this may be the ans but look at the left
                end = mid;
            }else{
                //you are in part of increasing order
                start = mid+1;//because we know mid+1 element > mid element
            }
        }
//in the end both start and end lies in the same element by the above two checks
//hence they are pointing to the same element it is the max element that is presented according to the 2 checks
      return start; //we can also give (end) bcs they both are =
       }
}

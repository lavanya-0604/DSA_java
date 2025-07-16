package LeetCode;

public class RotatedBinarySearch {
    public static void main(String[] args) {
      int[]nums ={4,5,6,7,0,1,2};
      System.out.println(findpivot(nums));
    }
    static int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        //if u not found the pivot in array, then it is not rotatedso we can use the ordinary binary search
        if(pivot==-1){//it return -1 when there is no pivot present here
            return BinarySearch(nums,target,0,nums.length-1);
        }
        //if pivot is found , we have the 2 asc order array
        //here we have the 3 cases
        if(nums[pivot]==target){
            return pivot;
        }
        //If target is greater than the first element, then it lies in the left sorted half.
        if(target >= nums[0]){
            return BinarySearch(nums,target,0,pivot-1);//because the number greater will be in the left side
        }
        //Else, it lies in the right sorted half.
            return BinarySearch(nums,target,pivot+1, nums.length-1);
    }
    static int BinarySearch(int[]nums,int target,int start,int end) {//start = start and end = end..
        while(start <= end) {
            int mid = start +(end - start) / 2;
            if (nums[mid] > target) {
                end=mid-1;
            } else if (nums[mid] < target) {
                start=mid+1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
//this is for distinct values not for the duplicate
    static int findpivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid < end && nums[mid] > nums[mid + 1]) {//if mid is in end so it will not consists of the mid+1
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {//if mid is in start so it will not consists of the mid-1
                return mid - 1;
            } else if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}


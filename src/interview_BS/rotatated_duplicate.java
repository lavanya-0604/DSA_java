package interview_BS;

public class rotatated_duplicate {
    public static void main(String[] args) {
        int[]nums ={4,5,6,7,0,1,2};
        System.out.println(findpivotwithduplicate(nums));
    }
    static int search(int[] nums, int target) {
        int pivot = findpivotwithduplicate(nums);
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
    //this is for duplicate
    static int findpivotwithduplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid < end && nums[mid] > nums[mid + 1]) {//if mid is in end so it will not consists of the mid+1
                return mid;
            }
            //if the elements in the start,end and middle are equal than skip the duplicate that presented
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                //skip the duplicates
                //NOTE:what if the element in the start or end are pivot??
                //check if start is pivot
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                //check whether end is pivot
                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted so the pivot should be in right
            if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}

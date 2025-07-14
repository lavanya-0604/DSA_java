package interview_BS;
//floor number = greatest number which is smaller than or equal to target
public class floornumber {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(FloorNumber(arr,target));
    }
    static int FloorNumber(int[]arr, int target){
        int start = 0;
        int end  = arr.length-1;
        while(start<=end){//when the target element is not present there then when it moves +1 it go outside
            //it will violate the while loop and go out of it so we consider the start as a ceiling number
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else if (arr[mid]==target) {
                return mid;
            }
        }//when the loop is violated it will return the end
        return end;//we will get the greater element of which is <= target
    }
    }

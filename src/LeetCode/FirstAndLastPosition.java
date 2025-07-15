package LeetCode;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        FirstAndLastPosition obj = new FirstAndLastPosition();
        int[]nums = {1,1,2,3,7,7,7,7,8,8,};
        int target = 7;
        int[] result = obj.searchRange(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }
    public int[] searchRange(int[]nums,int target){
        int[] ans = {-1,-1};//initializing the ans in searchRange()
        //check for the first occurence of the target
        int start = search(nums,target,true);
        //check for the last occurence of the target
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    //this function just return the index value of the target
    int search(int[]nums,int target,boolean findstartindex){
        int ans = -1;//initializing the ans in search()
        // it changes according to the ans that present in the else condition
        //it is default of -1 bcs if there is know occurence of the target
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start +(end - start) / 2;
            if (nums[mid] > target) {
                end=mid-1;
            } else if (nums[mid] < target) {
                start=mid+1;
            } else{//if the target is in the middle
                //potential ans is found
                ans = mid;//for the return value if it tells -1 so we are doing the if condition
                if(findstartindex) {//already it is declared as the boolean so it will have the value inside them
                    end = mid - 1;//bcs we have to find the first occurence
                }else{
                    start = mid+1;//for the last occurence
                }
            }
        }
        return ans;
    }
}

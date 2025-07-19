package LeetCode;

import java.util.Arrays;

public class Duplicatenumber {
    public static void main(String[] args) {
        int[]nums = {2,1,4,3,2};
        cycle(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int cycle(int[]nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i] != i+1) {
                int correct = nums[i] - 1;//index = value-1 so we are declaring this
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }
            else{
                    i++;
                }
            }
        return -1;
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

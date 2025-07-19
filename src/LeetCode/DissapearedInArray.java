package LeetCode;

import java.util.ArrayList;
import java.util.List;
//same as the missing number but we have modified because of the arraylist present here
class DissapearedInArray {
    public static void main(String[] args) {
        int[]arr ={4,3,2,7,8,2,3,1};
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i< nums.length){
            int correct = nums[i] - 1;//index = value-1 so we are declaring this
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        //just finding the missing number by arraylist
        List<Integer> ans = new ArrayList<>();
        for(int index = 0;index < nums.length;index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
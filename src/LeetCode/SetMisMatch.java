package LeetCode;

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
          int[]arr = {1,2,2,4};
        findErrorNums(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //searching for a first missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                //missing = index+1
                //duplicates = number at missing index
                return new int[] {arr[index],index+1};
            }
        }

    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}


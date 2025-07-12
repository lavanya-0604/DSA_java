package binarysearch_dsa;

import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
          int[]arr = {12,8,76,4,32,23};
          int target = 12;
        Arrays.sort(arr);
        System.out.println(BinarySearch(arr,target));

    }
    static int BinarySearch(int[]arr,int target) {//left = start and right = end..
        //to make them link with the index value
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            //find the middle element
            //int mid = (left + right) / 2; might be possible that the (left + right) this will exceed the
            // int value in java when we are using array with the larger size
            int mid = left +(right - left) / 2;//to avoid the unwanted error we are using this
            if (arr[mid] > target) {
                right=mid-1;
            } else if (arr[mid] < target) {
                left=mid+1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}

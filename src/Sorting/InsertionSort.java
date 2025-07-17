package Sorting;

import java.util.Arrays;

//here we are partially sorting the array
//Builds the sorted array one element at a time by inserting elements into their correct position.
//For array [5, 3, 2, 4]:
//Start with [5]
//Insert 3: [3, 5]
//Insert 2: [2, 3, 5]
//Insert 4: [2, 3, 4, 5]
//insertion sort is efficient then the bubble sort
public class InsertionSort {
    public static void main(String[] args) {
         int[]arr = {4,5,1,2,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {//the j-- Move left to compare with previous elements
                //if it ++ then the array will be  out if bound
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

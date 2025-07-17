package Sorting;
//selection sort is a technique of selecting an element and placing it in the correct index
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
          int[]arr={5,4,3,2,1};
          selection(arr);
          System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
       for(int i=0;i<arr.length;i++){
           //find the max element in the remaining array and swap with the correct option
           int last = arr.length-i-1;//to ignore the already sorted index at the end
           int maxelement = getmaxindex(arr,0,last);
           //swap the last element with the max element
           swap(arr,maxelement,last);
       }
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getmaxindex(int[] arr, int start, int end) {
        int max = start;
        for(int i=start;i<=end;i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }


}

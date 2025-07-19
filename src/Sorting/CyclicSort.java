package Sorting;

import java.util.Arrays;

//use when given the ranges of an array is 1 to N
//it requires only 1 pass to sort (use i only)
//it is just check,swap and move
public class CyclicSort {
    public static void main(String[] args) {
         int[]arr = {4,3,2,7,8,2,3,1};
         cycle(arr);
         System.out.println(Arrays.toString(arr));
    }
  static void cycle(int[]arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i] - 1;//index = value-1 so we are declaring this
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
  }
  static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
  }
}

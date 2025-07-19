package LeetCode;

import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        int[]arr = {7,8,9,11,12};//output will be the 10
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int sort(int[]arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            //ignore the negative number because they ask for the +ve one
            //it should be less than or equal to the arr.length
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //searching for a first missing element
        for(int index = 0; index < arr.length;index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }
        //for case 2 when they all are in correct index
        //because if it greater than that of the index value is missing in the array
        return arr.length+1;
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}


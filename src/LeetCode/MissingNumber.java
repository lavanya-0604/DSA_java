package LeetCode;
//amazon question
import java.util.Arrays;
//here in the sorted array the element(arr[i]) == index
//we dont know how many iteration needed so we are using the while loop
public class MissingNumber {
    public static void main(String[] args) {
        int[]arr = {2,1,0,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int sort(int[]arr){
         int i =0;
//i < arr.length is preferred for readability and clarity.
         while(i<arr.length){
             int correct = arr[i];
             //we are searching for range 1 to N so the arr should be in the length (arr[i] < arr.length)
             //if it is not present it will give the out of bound....
             if(arr[i] < arr.length && arr[i] != arr[correct]){
                 swap(arr,i,correct);
             }else{
                 i++;
             }
         }
     //searching for a first missing element
        for(int index = 0; index < arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }
        //for case 2 when they all are in correct index
        return arr.length;
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

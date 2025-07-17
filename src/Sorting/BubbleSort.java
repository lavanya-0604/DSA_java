package Sorting;
import java.util.Arrays;
//it is a comparison sort method
//OTHER NAME : sinking sort and exchange sort
public class BubbleSort {
    public static void main(String[] args) {
           int [] arr = {3,1,5,4,2};
           bubble(arr);
           System.out.println(Arrays.toString(arr));
    }
    //when the larger element comes at the end we can skip them to not swap technique
    static void bubble(int[]arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step the largest element will be come at the end
            for(int j = 1; j <= arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                   swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}

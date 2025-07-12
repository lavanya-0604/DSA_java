package linearsearch_dsa;

import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,4,67,9},
                {3,4,12},
                {90,76,23,10},
                {18,24,99,100}
        };
        int target = 23;
        //int[] a = {2, 3}; so int[] ans
        int[]ans= search(arr,target);//it only gives the one number so 1D array is enough
        System.out.println(Arrays.toString(ans));//Uses Arrays.toString() for easy display.
    }
    static int[] search(int[][]arr,int target){//it only gives the one number so 1D array is enough
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){//because col have to present with the help of the row
                if(arr[row][col] == target){
                    return new int[]{row, col};//ex:{2, 3}
                }
            }
        }
        return new int[]{-1, -1};
    }
}

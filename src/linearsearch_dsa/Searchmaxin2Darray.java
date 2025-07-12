package linearsearch_dsa;
//it is same for the min value we have already done
public class Searchmaxin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,4,67,9},
                {3,4,12},
                {90,76,23,10},
                {18,24,99,100}
        };
        System.out.println(max(arr));
    }
    static int max(int[][]arr){
        //Integer.MIN_VALUE is the minimum value that integer can hold
        int max = Integer.MIN_VALUE;//we can also use arr[0][0];
        for(int row=0;row< arr.length;row++){//we can also use the for each loop
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}


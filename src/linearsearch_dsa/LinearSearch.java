package linearsearch_dsa;
//linear search is for the unsorted array
//linear search in arrays
public class LinearSearch {
    public static void main(String[]args) {
        int[] arr = {12, 43, 1, 10, 34, 23};
        int target = 10;
        int result = linearsearch(arr, target);
        int result1 = linearsearch2(arr, target);
        System.out.println(result1);
        System.out.println(result);
    }
    //in for each loop method
    static int linearsearch2(int[]arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run to determine the index of the array
        for (int element : arr){
            if(element == target){
                return element;
            }
        }
        //if the taget is not in the array
        return Integer.MAX_VALUE;//because -1 number can be also present in the array so instead of -1 we are using this
    }
    //in boolean
    static boolean linearsearch3(int[]arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        //run to determine the index of the array
        for (int element : arr){
            if(element == target){
                return true;
            }
        }
        //if the taget is not in the array
        return false;//due to boolean we are using the false
    }
    //in index method
    //search in the array: return the index value
    //if not return -1
    static int linearsearch(int[]arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run to determine the index of the array
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //if the taget is not in the array
        return -1;
    }
}

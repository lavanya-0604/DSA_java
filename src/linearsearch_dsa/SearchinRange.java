package linearsearch_dsa;

public class SearchinRange {
    public static void main(String[] args) {
        int[]arr = {12,3,43,17,13,21};
        int target = 17;
        int result = linearsearch(arr,target,1,4);
        System.out.println(result);
    }
    //if it not in the range it will provide the output of the -1
    static int linearsearch(int[]arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        //run to determine the index of the array
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //if the taget is not in the array
        return -1;
    }
}

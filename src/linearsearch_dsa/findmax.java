package linearsearch_dsa;

public class findmax {
    public static void main(String[] args) {
        int[]arr = {18,9,3,36,2,6,35};
        System.out.println(max(arr));
    }
    static int max(int[]arr){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}

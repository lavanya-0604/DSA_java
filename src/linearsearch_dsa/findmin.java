package linearsearch_dsa;

public class findmin {
    public static void main(String[] args) {
        int[]arr = {18,9,3,32,2,6,35};
        System.out.println(min(arr));
    }
    static int min(int[]arr){
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]< ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

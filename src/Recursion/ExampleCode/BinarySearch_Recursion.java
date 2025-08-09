package Recursion.ExampleCode;
//we are dividing the array into 2 so we can solve this problem using the recursion
public class BinarySearch_Recursion {
    public static void main(String[] args) {
          int[]arr = {1,2,3,4,55,77,78};
          int target = 4;
          System.out.println(search(arr,target,0,arr.length-1));
    }
 //the start and end will be used for the future steps adn used all over again and again so it will bw placed in the argument
 //the mid is not used in the future so it is not consider in the argument(so it is used in the body)
    static int search(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target<arr[mid]){//we used the recursion here
            return search(arr,target,s,mid-1);
        }
        return search(arr,target,mid+1,e);
    }
}

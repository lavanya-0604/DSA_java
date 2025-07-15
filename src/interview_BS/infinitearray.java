package interview_BS;
public class infinitearray {
    public static void main(String[] args) {
        int[] arr= {3,5,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[]arr,int target){
        //first find the name
        //first start with size of box 2
        int start =0;
        int end = 1;
        //condition for the target to lie in a range
        if(target > arr[end]){
            int newStart = end +1;//this is a new start
            // end = previous end + sizeofarray*2
            end = end +(end - start +1)*2;//doubling the size of an array
            //1+(1-0+1)*2 gives u the 1+(2)*2 = 5 so the new end will be the array index 5
            //start = 1(end) +1 gives u the index value 2
            //lastly the second chunk will be from the index 2 to 5
            start = newStart;//new start
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[]arr,int target,int start,int end){
        //this is an infinite array so we don't know the arr.length()
        while(start <= end) {
            int mid = start +(end - start) / 2;
            if (arr[mid] > target) {
                end=mid-1;
            } else if (arr[mid] < target) {
                start=mid+1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
    }


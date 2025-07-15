package LeetCode;
//exact approach like the ceiling number
//ignore the target = what we are looking for smallest which is greater than the element
//if target is greater than the element present in the array then return start
public class SmallestGreaterThanElement {
    public static void main(String[]args){
        char[]letters = {'c','f','j'};
        char target = 'd';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(letters[mid]< target){
                start = mid+1;
            }
            else if(letters[mid]>target){
                end = mid-1;
            }
        }
        return letters[start % letters.length];//to get the char as an output
        //the binary start with the mid value 1 so then
        //letters[1%3] = letters[1] so now we can get the char in array
        //it is usefull instead of letters[start] when we are given the target that it greater than the char present in the array
    }
}

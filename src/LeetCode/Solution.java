package LeetCode;

public class Solution {
    public static void main(String[]args) {
        int[]nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digit2(12344));//shortcut method on digits(present in (number system))
    }
    //number of numbers which has the even digits
    static int findNumbers(int[] nums){
        int count =0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //to check whether the digit of the numbers are even
    static boolean even(int num){
        int numberiseven = digit(num);
        return numberiseven%2==0;
    }
    static int digit2(int num){
        return (int)(Math.log10(num)) + 1;//shortcut to count the number of digits
    }
    //to count the  number of digit in the  number
    static int digit(int num){
        int count = 0;
        if(num<0){
            num*=-1;//if the number is a negative number number
        }
        if(num == 0){
            return 1;
        }
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}


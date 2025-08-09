package Learning;

import java.util.Scanner;

public class Palindrome_integer {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check the palindrome:");
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        if(x<0) return false;
        int original = x;
        int reversed = 0;
        while(x!=0){
            int digit = x%10;
            reversed = reversed*10+digit;
            x = x /10;
        }
        return reversed == original;
    }
}


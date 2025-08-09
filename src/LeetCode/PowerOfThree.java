package LeetCode;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerThree(27));
    }
    static boolean isPowerThree(int n){
        if(n<=0) return false;
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
}
//n = 27 → 27 % 3 == 0 → true
//n = 9 → 9 % 3 == 0 → true
//n = 3 → 3 % 3 == 0 → true
//n = 1 → 1 % 3 == 0 → false → loop stops

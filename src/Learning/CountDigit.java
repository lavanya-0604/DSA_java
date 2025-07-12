package Learning;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println(digit(1234));
    }
    static int digit(int num){
        int count = 0;
        while(num > 0){//if we use the if statement it will run only one time so we r using while loop
            count++;
            num/=10;
        }
        return count;
    }
}

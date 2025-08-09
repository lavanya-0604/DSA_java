package Learning;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.println(a+ " ");//the a starts from 0 so we are printing the a
            int next = a+b;
            a=b;
            b=next;

        }
    }
}

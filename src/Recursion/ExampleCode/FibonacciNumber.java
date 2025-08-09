package Recursion.ExampleCode;
//in fibonacci wkt F(0) = 0 , F(1) = 1
public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    static int fibonacci(int n){
        //base condition
        if(n<2){
            return n;
        }
        //this is not a tail recursion
        // because it has extra work to be done like additioning the two values
       return  fibonacci(n-1) + fibonacci(n-2);
    }
}

package Recursion.introduction;
//write a function and calls the number
//The number should be from first 1 2 3 4 5
public class Number_Program {
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){
        //the method that present here is the function is calling the other function
        //body and definition of these functions are same
        System.out.println(n);
        print2(2);
    }
    //in this method every call will fill the stack memory in order to avoid this we are using the recursion
    //using this method the memory of the computer will exceed the limit => stack overflow
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
}

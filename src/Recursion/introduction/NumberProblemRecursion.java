package Recursion.introduction;
//recursions means repetitions
//recursions means  function that calls itself
public class NumberProblemRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        //Base condition
        if(n == 5){
            //inorder to avoid filling the stack memory we are using the base condition for the recursion
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive call
        //if are calling a function again and again it can be treated as a  separate call in the stack
        //this is tail recursion
        //because this is the last function call
        print(n+1);
    }
}

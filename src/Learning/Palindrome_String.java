package Learning;

public class Palindrome_String {
    public static void main(String[] args) {
        String original = "madam";
        String reverse = new StringBuilder(original).reverse().toString();
        if(original.equals(reverse)){
            System.out.print("the given string is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }

}

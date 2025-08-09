package Learning;

public class Palindrome_method {
    public static void main(String[] args) {
           String str = "madam";
           System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {//it is diff from arr.length so that we are using the ()
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}

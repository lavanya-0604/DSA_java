package Learning;

import static java.lang.Math.pow;

public class sqrt {
    public static void main(String[]args){
        sqrt obj = new sqrt();
        int x = 9;
        System.out.println(obj.mySqrt(x));
    }
    public int mySqrt(int x) {
        int result = (int) pow(x,0.5);
        return result;
    }

}

package Pattern;
//triangle
public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }
    static void pattern7(int n){
        for (int row = 0; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for(int col = 0; col < 2*row-1; col++) {//the 2*row is used to apply
                // the star on the both sides to make them the full triangle
              System.out.print("*");
            }
            System.out.println();
        }
    }
}

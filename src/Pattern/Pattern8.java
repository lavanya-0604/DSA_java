package Pattern;
//triangle with the numbers
public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }
    static void pattern8(int n){
        for (int row = 0; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2*row-1; col++) {//to make the full triangle we are using the 2*row
                System.out.print(col);
            }
            System.out.println();

        }
    }
}

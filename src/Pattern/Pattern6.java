package Pattern;
//diamond
public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int TotalCol = row > n ? 2 * n - row : row;
            int noofspace = n - TotalCol;
            for (int s = 0; s < noofspace; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < TotalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

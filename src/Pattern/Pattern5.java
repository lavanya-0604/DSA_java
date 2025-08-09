package Pattern;
//combination of the right angle triangle and upside down right angle traingle
public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for (int row = 1; row <= 2*n; row++) {
            int TotalColsInRow = row > n ? 2*n-row : row;//if there is the +1 then there will be unnessasary one line in present there
            for (int col = 1; col <= TotalColsInRow; col++) {
            System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

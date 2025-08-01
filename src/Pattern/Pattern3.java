package Pattern;
//upside down right angle triangle
public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern3(int n){
        for (int row = 1; row <= n ; row++) {
            for(int col = 1; col <= n-row+1; col++){//5-1+1 = 5 => 5-2+1 = 4 => 5-3+1 = 3(likewise the pattern has been done)
                //also we can use row =0 and the col<= n-row
                //for every row,run the col
                System.out.print("* ");
            }
            //when one row is printed , we have to add a new line
            System.out.println(" ");
        }
    }
}

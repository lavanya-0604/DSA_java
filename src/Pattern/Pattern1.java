package Pattern;
//right angle triangle
public class Pattern1 {
    public static void main(String[]args){
        pattern1(5);
    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++){
                //for every row,run the col
                System.out.print("* ");
            }
            //when one row is printed , we have to add a new line
            System.out.println(" ");
        }
    }
}

package LeetCode;
//Binary search is not about arrays —
// it's about searching in a sorted range using the divide-and-conquer strategy.
public class sqrt_BS {
    public static void main(String[] args) {
        sqrt_BS obj = new sqrt_BS();
        int x = 10;
        System.out.println(obj.mySqrt(x));

    }
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        //searching in a range of numbers from 1 to x
        int start = 1;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
           //to avoid overflowing we are this instead of mid*mid <= x
            //mid <= (x/mid) it avoids the overflow
            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}

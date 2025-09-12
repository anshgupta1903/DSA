class Solution {
    public int reverse(int x) {
        boolean is_neg = x < 0;
        if (is_neg) x = -x;

        int n = 0;
        while (x > 0) {
            int digit = x % 10;

            // check if n*10 + digit will overflow
            if (n > (Integer.MAX_VALUE - digit) / 10) {
                return 0; // overflow
            }

            n = n * 10 + digit;
            x = x / 10;
        }

        return is_neg ? -n : n;
    }
}

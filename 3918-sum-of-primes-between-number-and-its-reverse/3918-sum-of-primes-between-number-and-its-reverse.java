class Solution {
    public int sumOfPrimesInRange(int n) {
        int x = n;
        int rev = 0;

        // Reverse the number
        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }

        int min = Math.min(x, rev);
        int max = Math.max(x, rev);

        int sum = 0;

        // Check every number in the range
        for (int i = min; i <= max; i++) {

            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
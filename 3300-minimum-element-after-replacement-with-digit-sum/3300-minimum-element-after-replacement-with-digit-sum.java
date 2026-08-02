class Solution {
    public int minElement(int[] nums) {
        int minSum = Integer.MAX_VALUE;

        for (int num : nums) {
            int currentSum = getDigitSum(num);
            minSum = Math.min(minSum, currentSum);
        }

        return minSum;
    }

    public int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
class Solution {

    TreeSet<Integer> list = new TreeSet<>();

    public int[] findEvenNumbers(int[] digits) {

        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[digits.length];

        rec(digits, temp, used);

        int[] ans = new int[list.size()];

        int j = 0;

        for (int i : list) {
            ans[j++] = i;
        }

        return ans;
    }

    public void rec(int[] arr, ArrayList<Integer> temp, boolean[] used) {

        if (temp.size() == 3) {

            // First digit cannot be 0
            if (temp.get(0) == 0) {
                return;
            }

            // Last digit must be even
            if (temp.get(2) % 2 != 0) {
                return;
            }

            int num = 0;

            for (int x : temp) {
                num = num * 10 + x;
            }

            list.add(num);

            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (used[i]) {
                continue;
            }

            used[i] = true;
            temp.add(arr[i]);

            rec(arr, temp, used);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}
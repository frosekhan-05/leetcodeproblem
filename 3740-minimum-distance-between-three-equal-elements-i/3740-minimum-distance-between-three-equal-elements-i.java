import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        // Store all indices
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        int ans = Integer.MAX_VALUE;

        for (ArrayList<Integer> list : map.values()) {

            if (list.size() >= 3) {

                for (int i = 0; i <= list.size() - 3; i++) {

                    for (int j = i + 1; j <= list.size() - 2; j++) {

                        for (int k = j + 1; k < list.size(); k++) {

                            int a = list.get(i);
                            int b = list.get(j);
                            int c = list.get(k);

                            int dist = Math.abs(a - b)
                                     + Math.abs(b - c)
                                     + Math.abs(c - a);

                            ans = Math.min(ans, dist);
                        }
                    }
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
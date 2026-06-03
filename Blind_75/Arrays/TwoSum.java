package Blind_75.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] TwoSumBrute(int nums[], int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] TwoSumOptimized(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int nums[] = { 3, 3 };
        int target = 6;
        int ans[] = TwoSumOptimized(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }
    }
}

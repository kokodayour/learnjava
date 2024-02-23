package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Solution1 {
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No such two nums");
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> elemIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (elemIndex.containsKey(target - nums[i])) {
                return new int[]{elemIndex.get(target - nums[i]), i};
            }
            elemIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("No such two nums");
    }

    public static int[] twoSum3(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            int next = target - nums[i];
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[j] == next) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No such two nums");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 27;
        System.out.println(Arrays.toString(twoSum1(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
        System.out.println(Arrays.toString(twoSum3(nums, target)));
    }
}

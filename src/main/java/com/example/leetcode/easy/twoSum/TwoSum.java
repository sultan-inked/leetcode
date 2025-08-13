package com.example.leetcode.easy.twoSum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] solve = {0,1};

        int[] result = twoSum(nums, target);

        System.out.printf("isCorrect=%s solve=%s result=%s"
                .formatted(Arrays.equals(solve, result), Arrays.toString(solve), Arrays.toString(result)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                if ((a + b) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }
}

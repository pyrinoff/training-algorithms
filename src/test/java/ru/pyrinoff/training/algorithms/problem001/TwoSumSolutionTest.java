package ru.pyrinoff.training.algorithms.problem001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumSolutionTest {

    ITwoSumSolution solution = new TwoSumSolution2ByGPT();

    @Test
    void one() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertNotEquals(result[0], result[1]);
        Assertions.assertEquals(target, nums[result[0]]+nums[result[1]]);
    }

    @Test
    void two() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertNotEquals(result[0], result[1]);
        Assertions.assertEquals(target, nums[result[0]]+nums[result[1]]);
    }

    @Test
    void three() {
        int[] nums = {3,3};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertNotEquals(result[0], result[1]);
        Assertions.assertEquals(target, nums[result[0]]+nums[result[1]]);
    }

}

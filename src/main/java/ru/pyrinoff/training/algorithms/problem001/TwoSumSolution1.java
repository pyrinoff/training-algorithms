package ru.pyrinoff.training.algorithms.problem001;

import lombok.SneakyThrows;

//My, straightforward solution. Complexity O(n^2)
public class TwoSumSolution1 implements ITwoSumSolution {

    @SneakyThrows
    @Override
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int firstNumber = nums[i];
            for(int j=i+1; j < nums.length; j++) {
                if(firstNumber + nums[j] == target) return new int[] {i, j};
            }
        }
        throw new Exception("Cant find solution!");
    }

}

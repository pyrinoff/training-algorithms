package ru.pyrinoff.training.algorithms.problem001;

import lombok.SneakyThrows;

import java.util.HashMap;


//Solution by ChatGPT. Complexity O(n)
public class TwoSumSolution2ByGPT implements ITwoSumSolution {

    @SneakyThrows
    @Override
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>(); // Map to store elements and their indices

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int diff = target - currentNumber;
            if (numMap.containsKey(diff)) { //moment when diff = second number, that already in hashmap
                return new int[]{numMap.get(diff), i};
            }
            numMap.put(nums[i], i); //don't find our pair - put [value]=index into hashmap
        }

        throw new IllegalArgumentException("Cant find solution!");
    }

}

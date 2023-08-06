package ru.pyrinoff.training.algorithms.problem014;

import java.util.Arrays;

//More elegant, but seems not efficient, O(m*n*log(n))  - sorting is O(n*log(n)), plus compare O(m).
public class LongestPrefixSolution2FromAnswers implements ILongestPrefixSolution {

    @Override
    public String longestCommonPrefix(String[] inputStrings) {
        Arrays.sort(inputStrings);
        String s1 = inputStrings[0];
        String s2 = inputStrings[inputStrings.length-1];
        int idx = 0;
        while(idx < s1.length()){
            if(s1.charAt(idx) != s2.charAt(idx)) break;
            idx++;
        }
        return s1.substring(0, idx);
    }

}

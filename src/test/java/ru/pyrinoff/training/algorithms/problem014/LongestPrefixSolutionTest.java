package ru.pyrinoff.training.algorithms.problem014;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.pyrinoff.training.algorithms.problem013.IRomanToIntegerSolution;
import ru.pyrinoff.training.algorithms.problem013.RomanToIntegerSolution2;

public class LongestPrefixSolutionTest {

    ILongestPrefixSolution solution = new LongestPrefixSolution2FromAnswers();

    @Test
    void one() {
        Assertions.assertEquals("fl", solution.longestCommonPrefix(
                new String[] {"flower", "flow", "flight"}
        ));
    }

    @Test
    void two() {
        Assertions.assertEquals("", solution.longestCommonPrefix(
                new String[] {"dog", "racecar", "car"}
        ));
    }

}

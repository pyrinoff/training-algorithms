package ru.pyrinoff.training.algorithms.problem013;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerSolutionTest {

    IRomanToIntegerSolution solution = new RomanToIntegerSolution2();

    @Test
    void one() {
        String roman = "III";
        Assertions.assertEquals(3, solution.romanToInt(roman));
    }

    @Test
    void two() {
        String roman = "LVIII";
        Assertions.assertEquals(58, solution.romanToInt(roman));
    }

    @Test
    void three() {
        String roman = "MCMXCIV";
        Assertions.assertEquals(1994, solution.romanToInt(roman));
    }

}

package ru.pyrinoff.training.algorithms.problem009;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberSolutionTest {

    IPalindromeNumberSolution solution = new PalindromeNumberSolution1();

    @Test
    void one() {
        int input = 121;
        Assertions.assertEquals(true, solution.isPalindrome(input));
    }

    @Test
    void two() {
        int input = -121;
        Assertions.assertEquals(false, solution.isPalindrome(input));
    }

    @Test
    void three() {
        int input = 10;
        Assertions.assertEquals(false, solution.isPalindrome(input));
    }


}

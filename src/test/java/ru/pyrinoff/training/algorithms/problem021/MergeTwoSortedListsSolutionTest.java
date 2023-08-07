package ru.pyrinoff.training.algorithms.problem021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.pyrinoff.training.algorithms.problem014.ILongestPrefixSolution;
import ru.pyrinoff.training.algorithms.problem014.LongestPrefixSolution2FromAnswers;

public class MergeTwoSortedListsSolutionTest {

    IMergeTwoSortedListsSolution solution = new MergeTwoSortedListsSolution();

    @Test
    void one() {
        ListNode solutionArray = solution.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(3, new ListNode(4)))
        );
        Assertions.assertNotNull(solutionArray);
        Assertions.assertArrayEquals(
                new int[]{1, 1, 2, 3, 4, 4},
               solutionArray.toArray()
        );
    }

    @Test
    void name() {
        System.out.println("HELLO");
    }

}

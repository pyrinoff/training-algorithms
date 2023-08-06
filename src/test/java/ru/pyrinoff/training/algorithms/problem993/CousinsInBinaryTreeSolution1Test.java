package ru.pyrinoff.training.algorithms.problem993;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.pyrinoff.training.algorithms.problem993.util.TreeNode;

public class CousinsInBinaryTreeSolution1Test {

    ICousinsInBinaryTreeSolution solution = new CousinsInBinaryTreeSolution3FromAnswers();

    @Test
    void one() {
        TreeNode testOne = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, null, null), null),
                new TreeNode(3, null, null)
        );
        Assertions.assertEquals(false, solution.isCousins(testOne, 4, 3));
    }

    @Test
    void two() {
        TreeNode testTwo = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, null, null), null),
                new TreeNode(3, new TreeNode(5, null, null), null)
        );
        Assertions.assertEquals(true, solution.isCousins(testTwo, 5, 4));
    }

    @Test
    void three() {
        TreeNode testThree = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, null, null), null),
                new TreeNode(3, null, null)
        );
        Assertions.assertEquals(false, solution.isCousins(testThree, 3, 2));
        ;
    }

    @Test
    void four() {
        TreeNode testFour = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(6, null, null),
                                new TreeNode(7, null, null)
                        ),
                        null
                ),
                new TreeNode(3,
                        new TreeNode(5,
                                new TreeNode(8, null, null), null
                        ),
                        new TreeNode(9, null, null)
                )
        );
        Assertions.assertEquals(false, solution.isCousins(testFour, 6, 7));
    }

}

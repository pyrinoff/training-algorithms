package ru.pyrinoff.training.algorithms.problem993;

import ru.pyrinoff.training.algorithms.problem993.util.TreeNode;

//https://leetcode.com/problems/cousins-in-binary-tree/
public class CousinsInBinaryTreeSolution1 implements ISolution {

  public boolean isCousins(TreeNode root, int x, int y) {
        return deepOfValue(root, x, 0) == deepOfValue(root, y, 0) && !hasSameParent(root, x, y);
    }

    public static int deepOfValue(TreeNode node, int val, int currentDeep) {
        if (node.val == val) return currentDeep;
        if (node.right != null) {
            int rightDeep = deepOfValue(node.right, val, currentDeep + 1);
            if (rightDeep != -1) return rightDeep;
        }
        if (node.left != null) {
            int leftDeep = deepOfValue(node.left, val, currentDeep + 1);
            if (leftDeep != -1) return leftDeep;
        }
        return -1;
    }

    public static boolean hasSameParent(TreeNode node, int val1, int val2) {
        if (node.left != null && (node.left.val == val1 || node.left.val == val2)) {
            return node.right != null && (node.right.val == val1 || node.right.val == val2);
        }
        if(node.left != null && hasSameParent(node.left, val1, val2)) return true;
        if(node.right != null && hasSameParent(node.right, val1, val2)) return true;
        return false;
    }

}

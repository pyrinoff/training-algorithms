package ru.pyrinoff.training.algorithms.problem993;

import lombok.SneakyThrows;
import ru.pyrinoff.training.algorithms.problem993.util.TreeNode;

//https://leetcode.com/problems/cousins-in-binary-tree/
//My straightforward solution #2. Complexity O(n)
public class CousinsInBinaryTreeSolution2 implements ICousinsInBinaryTreeSolution {

    public static class DeepResponse {
        int deep;
        TreeNode parent;

        public DeepResponse(int deep, TreeNode parent) {
            this.deep = deep;
            this.parent = parent;
        }

        @Override
        public String toString() {
            return "DeepResponse{" +
                    "deep=" + deep +
                    ", parent=" + parent +
                    '}';
        }

    }

    @SneakyThrows
    public boolean isCousins(TreeNode root, int x, int y) {
        DeepResponse deepResponseX = getDeep(root, x , 0);
        DeepResponse deepResponseY = getDeep(root, y , 0);
        if(deepResponseX.deep == -1 || deepResponseY.deep == -1) throw new Exception("Cant find our int in nodes!");
        if(deepResponseX.parent == null || deepResponseY.parent == null) throw new Exception("Cant find parent nodes!");
        return deepResponseX.deep == deepResponseY.deep
                && !deepResponseX.parent.equals(deepResponseY.parent);
    }

    public static DeepResponse getDeep(TreeNode node, int val, int currentDeep) {
        if (node.right != null) {
            if(node.right.val == val) return new DeepResponse(currentDeep, node);
            DeepResponse rightDeep = getDeep(node.right, val, currentDeep + 1);
            if (rightDeep.deep != -1) return rightDeep;
        }
        if (node.left != null) {
            if(node.left.val == val) return new DeepResponse(currentDeep, node);
            DeepResponse leftDeep = getDeep(node.left, val, currentDeep + 1);
            if (leftDeep.deep != -1) return leftDeep;
        }
        return new DeepResponse(-1, null);
    }

}

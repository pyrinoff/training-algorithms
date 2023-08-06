package ru.pyrinoff.training.algorithms.problem993;

import lombok.SneakyThrows;
import ru.pyrinoff.training.algorithms.problem993.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/cousins-in-binary-tree/solutions/3294625/java-runtime-0-ms/
//Complexity O(n)
public class CousinsInBinaryTreeSolution3FromAnswers implements ICousinsInBinaryTreeSolution {

    @SneakyThrows
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int foundCounter = 0;
        while (!queue.isEmpty()) { //traverse the binary tree level by level
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode curr = queue.poll(); //get one and delete from queue
                if ((curr.left != null && curr.right != null) && (curr.left.val == x && curr.right.val == y || curr.left.val == y && curr.right.val == x))
                    return false; //same parent = false
                if (curr.val == x || curr.val == y) {
                    foundCounter++; //value of current node equals to int - add to counter
                    if(foundCounter == 2) return true; //performance improvement by me (found all 2 ints)
                }
                if (curr.left != null) queue.offer(curr.left); //add level to traverse
                if (curr.right != null) queue.offer(curr.right); //add level to traverse
            }
            //if (foundCounter == 2) return true;    //performance improvement by me
            //foundCounter = 0;                      //performance improvement by me
        }
        return false;
    }

}

package ru.pyrinoff.training.algorithms.problem021;

import java.util.List;

/**
 * See 2 problems here:
 * 1) merge 2 sorted array in nice way
 * 2) filling result node structure in comfort and non-complex way
 * That is iterative style solution.
 */
public class MergeTwoSortedListsSolution implements IMergeTwoSortedListsSolution {

    //more nice-looking
    @Override
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode iteratorNode = null;
        ListNode resultList = null;

        while (list1 != null || list2 != null) {                      //while have unprocessed values
            //Define which number will be next
            ListNode newNode;
            if (list2 == null                                         //but list1 is only that not empty = use it
                    || list1 != null && list1.getVal() <= list2.getVal()        //list1 val is smaller
            ) {
                newNode = new ListNode(list1.getVal());
                list1 = list1.getNext();
            } else {                                                 //list2 is only that not empty = use it
                newNode = new ListNode(list2.getVal());
                list2 = list2.getNext();
            }

            //Add new node to out list.
            // Will look nicer if we add method .add() to TreeNode
            if (resultList == null) resultList = iteratorNode = newNode;
            else {
                iteratorNode.setNext(newNode);
                iteratorNode = newNode;
            }
        }
        return resultList;
    }

    //Straightforward algorithm
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode iteratorNode = null;
        ListNode resultList = null;

        while (list1 != null || list2 != null) {
            //Define current node
            ListNode newNode;
            if (list1 != null && list2 != null) {
                if (list1.getVal() <= list2.getVal()) {
                    newNode = new ListNode(list1.getVal());
                    list1 = list1.getNext();
                } else {
                    newNode = new ListNode(list2.getVal());
                    list2 = list2.getNext();
                }
            } else if (list1 != null) {
                newNode = new ListNode(list1.getVal());
                list1 = list1.getNext();
            } else {
                newNode = new ListNode(list2.getVal());
                list2 = list2.getNext();
            }
            //Set node to result
            if (resultList == null) resultList = iteratorNode = newNode;
            else {
                iteratorNode.setNext(newNode);
                iteratorNode = newNode;
            }
        }
        return resultList;
    }

    //Just for understanding process of forming result ListNode (filling node structure problem)
    public static ListNode listNodeFromArray(List<Integer> list) {
        ListNode result = null;
        ListNode resultIterator = null;

        for (int i = 0; i < list.size(); i++) {
            ListNode currentNode = new ListNode(list.get(i));
            if (i == 0) result = resultIterator = currentNode;
            else {
                resultIterator.setNext(currentNode);
                resultIterator = currentNode;
            }
        }
        return result;
    }

}

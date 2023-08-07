package ru.pyrinoff.training.algorithms.problem021;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    int[] toArray() {
        List<Integer> finalList = new ArrayList<>();
        ListNode currentNode = this;
        while (currentNode != null) {
            finalList.add(currentNode.getVal());
            currentNode = currentNode.next;
        }
        return finalList.stream().mapToInt(Integer::intValue).toArray();
    }

}
